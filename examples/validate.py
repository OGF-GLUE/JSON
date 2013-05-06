#!/usr/bin/env python

import json
import optparse
import os
import sys

import jsonschema # https://github.com/Julian/jsonschema

class MyRefResolver(jsonschema.RefResolver):
    def __init__(self, schema, schema_dir):
        jsonschema.RefResolver.__init__(self,schema.get("id", ""),schema)
        self._schemas = {}
        for file_name in os.listdir(schema_dir):
            if os.path.splitext(file_name)[1] != ".json":
                continue
            #print("loading schema file "+file_name)
            f = open(os.path.join(schema_dir,file_name))
            schema_str = f.read()
            f.close()
            schema = json.loads(schema_str)
            try:
                self._schemas[schema["id"]] = schema
            except KeyError:
                print("  didn't find id in "+file_name)

    def resolve_remote(self, uri):
        try:
            return self._schemas[uri]
        except KeyError:
            print("calling default resolve_remote on "+uri)
            jsonschema.RefResolver.resolve_remote(self,uri)

parser = optparse.OptionParser("usage: %prog [options] <schema file> <json file>")
parser.add_option("-d", "--schema_dir", action="store", type="string", dest="schema_dir",
                  help="the local directory containing the GLUE 2 json-schema files (default is .)")
(options, args) = parser.parse_args()

if len(args) != 2:
    parser.error("wrong number of arguments")

if not options.schema_dir:
    parser.error("a schema directory must be provided with -d")

f = open(args[0])
schema_str = f.read()
f.close()
f = open(args[1])
doc_str = f.read()
f.close()

schema = json.loads(schema_str)
doc = json.loads(doc_str)

jsonschema.validate(doc,schema,resolver=MyRefResolver(schema,options.schema_dir))
