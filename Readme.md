TCK Sample
==========

* sample-api  : this is the api project
* sample-tck  : this is the TCK. The TCK is packaged as a test jar (the TCK depends only on the api).
* sample-impl : this is the api implementation. The implementation uses the TCK as a dependency and unpacks the TCK tests
with the **maven-dependency-plugin**.

To build this project run the command `mvn clean install` in the root directory.
