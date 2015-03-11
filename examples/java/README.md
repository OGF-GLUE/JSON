
# Preliminaries

To begin, download the GLUE v2.0 JSON files from github:

`git clone https://github.com/OGF-GLUE/JSON.git`

and change to this directory - `JSON/examples/java`.

# Running the Example

Download the jars needed into the lib/ directory:

* [Apache commons lang 2.6](http://commons.apache.org/proper/commons-lang/download_lang.cgi)
* [Jackson core](http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/)
* [Jackson databind](http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/)
* [Jackson annotations](http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/)

You can compile and run the example and GLUE v2.0 Java classes by:

`ant -Dfile=DOCUMENT.json run`

for example:

`ant -Dfile=../activities.json run`

You can also compile by running `ant`, set your CLASSPATH to include lib/* and classes and then
running `java Glue2Pojo DOCUMENT.json`.

# Regenerating Java Classes

The GLUE v2.0 Java classes are generated using [jsonschema2pojo](http://www.jsonschema2pojo.org/) along with
some customization. The main reason the customization is necessary because jsonschema2pojo does not support
the allOf jsonschema directive.

The process to regenerate the Java classes is:

1. Download the latest [jsonschema2pojo release](https://github.com/joelittlejohn/jsonschema2pojo/releases).
The last version tested is 0.4.7.

2. Untar jsonschema2pojo.

3. Execute `python generate_pojo.py` to generate the Java classes in `src/org/ogf/glue2`. See that script for
the customizations performed to the jsonschema files and the generated Java classes.

## Generating Java classes with Maven

An example maven project file *pom.xml* is provided to generate the Java classes in your project using the maven software.

### Pre-requisite
* Maven v2.x+
* Java 1.7+

Usage: On command prompt go to the project's base folder and type *mvn package*

* JSONSchema2Pojo plug-in [overview](https://github.com/joelittlejohn/jsonschema2pojo/wiki/Getting-Started#the-maven-plugin)
* Detailed plug-in [configuration](http://joelittlejohn.github.io/jsonschema2pojo/site/0.4.8/generate-mojo.html)
