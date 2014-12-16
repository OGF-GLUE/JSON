#!/usr/bin/env python

import json
import os
import shutil
import subprocess
import sys
import tempfile

JAVA_EXAMPLE_DIR = os.path.split(os.path.abspath(__file__))[0]
EXAMPLE_DIR = os.path.split(JAVA_EXAMPLE_DIR)[0]
BASE_DIR = os.path.split(EXAMPLE_DIR)[0]
SCHEMA_DIR = os.path.join(BASE_DIR,"schema")

JS2P_DIR = None
file_names = os.listdir(JAVA_EXAMPLE_DIR)
for file_name in file_names:
    if file_name.startswith("jsonschema2pojo-"):
        JS2P_DIR = os.path.join(JAVA_EXAMPLE_DIR,"jsonschema2pojo-0.4.7")
        break

def getSchemaFiles(dir_name):
    file_names = os.listdir(dir_name)
    return filter(lambda file_name: file_name.endswith(".json"),file_names)

# add a javaType attribute so that Associations have better names
def addAssociationsJavaType(dir_name, file_names):
    for file_name in file_names:
        (name,extension) = os.path.splitext(file_name)
        f = open(os.path.join(dir_name,file_name))
        j = json.loads(f.read())
        f.close()
        try:
            j["properties"]["Associations"]["javaType"] = "org.ogf.glue2."+name+"Associations"
        except KeyError:
            pass
        f = open(os.path.join(dir_name,file_name),"w")
        f.write(json.dumps(j,sort_keys=True,indent=4))
        f.close()

def generateJava(dir_name, file_list):
    # clean up any previously generated files
    src_dir = os.path.join("src","org","ogf","glue2")
    try:
        shutil.rmtree(src_dir)
    except OSError:
        pass # directory may not exist

    file_list = _orderByDeps(file_list)

    # generating Glue2.json overwrites classes with stubs
    glue2_file_name = file_list.pop()

    # so generate it first:
    _generateJava(dir_name,glue2_file_name)

    # then clean up the stubs:
    for file_name in os.listdir(src_dir):
        if file_name != "Glue2.java":
            #print("  removing stub %s" % file_name)
            os.remove(os.path.join(src_dir,file_name))

    # then generate the rest:
    for file_name in file_list:
        (name,extension) = os.path.splitext(file_name)
        path = os.path.join("src","org","ogf","glue2",name+".java")
        if os.path.exists(path):
            print("   WARNING: file %s already exists" % name+".java")
        _generateJava(dir_name,file_name)


# generate referenced classes first so that class stubs aren't generated
def _orderByDeps(file_list):
    deps = _getDependencies(dir_name,file_list)

    ordered_files = []
    while len(deps) > 0:
        ready = filter(lambda file_name: len(deps[file_name]) == 0,deps.keys())
        ordered_files.extend(ready)
        for file_name in ready:
            del deps[file_name]
        for file_name in deps:
            deps[file_name] = filter(lambda f: f not in ready,deps[file_name])

    return ordered_files

def _getDependencies(dir_name, file_list):
    deps = {}
    for file_name in file_list:
        deps[file_name] = []
    for file_name in file_list:
        f = open(os.path.join(dir_name,file_name))
        j = json.loads(f.read())
        f.close()
        try:
            for d in j["allOf"]:
                deps[file_name].append(d["$ref"].split("/")[-1])
        except KeyError:
            pass
        try:
            for prop in j["properties"]:
                for d in j["properties"][prop]["items"]["allOf"]:
                    deps[file_name].append(d["$ref"].split("/")[-1])
        except KeyError:
            pass
    return deps
    
def _generateJava(dir_name, file_name):
    os.chdir(JS2P_DIR)
    print("generating "+file_name)
    subprocess.call(["./jsonschema2pojo",
                     "-l",
                     "--target",os.path.join(JAVA_EXAMPLE_DIR,"src"),
                     "--package","org.ogf.glue2",
                     "--source",os.path.join(dir_name,file_name)])
    os.chdir(JAVA_EXAMPLE_DIR)

# jsonschema2pojo doesn't support allOf:
#  "Supporting allOf, oneOf, anyOf may not be possible."
#    - https://github.com/joelittlejohn/jsonschema2pojo/issues/178
# since we only have one other schema in each allOf, we can just add 'extends' manually
def addParentClasses(dir_name, file_list):
    extends = _getExtends(dir_name,file_list)
    for (child,parent) in extends:
        _addParentClass(child,parent,
                        os.path.join("src","org","ogf","glue2",child+".java"))
    for (child,parent) in extends:
        if not os.path.exists(os.path.join("src","org","ogf","glue2",child+"Associations.java")):
            continue
        if not os.path.exists(os.path.join("src","org","ogf","glue2",parent+"Associations.java")):
            continue
        _addParentClass(child+"Associations",parent+"Associations",
                        os.path.join("src","org","ogf","glue2",child+"Associations.java"))

def _addParentClass(child, parent, file_name):
    f = open(file_name)
    code = f.read()
    f.close()
    code = code.replace("public class "+child+" {",
                        "public class "+child+" extends "+parent+" {")
    f = open(file_name,"w")
    f.write(code)
    f.close()

def _getExtends(dir_name, file_list):
    extends = []
    for file_name in file_list:
        (name,extension) = os.path.splitext(file_name)
        f = open(os.path.join(dir_name,file_name))
        j = json.loads(f.read())
        f.close()
        try:
            for d in j["allOf"]:
                parent_file_name = d["$ref"].split("/")[-1]
                (parent_name,extension) = os.path.splitext(parent_file_name)
                extends.append((name,parent_name))
        except KeyError:
            pass
    return extends


if __name__ == "__main__":
    dir_name = tempfile.mkdtemp()
    for file_name in os.listdir(SCHEMA_DIR):
        shutil.copy(os.path.join(SCHEMA_DIR,file_name),dir_name)
    schema_file_names = getSchemaFiles(dir_name)
    addAssociationsJavaType(dir_name,schema_file_names)
    generateJava(dir_name,schema_file_names)
    addParentClasses(dir_name,schema_file_names)
    shutil.rmtree(dir_name)
