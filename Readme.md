TCK Sample
==========

### Projects

* sample-api

    * This is the api project.

* sample-tck-junit

    * This is the TCK. The TCK is packaged as a test jar (the TCK depends only on the api).
    * This tck uses JUnit.

* sample-tck-testng

    * This is the TCK. The TCK is packaged as a test jar (the TCK depends only on the api).
    * This tck uses TestNG.

* sample-impl :

    * This is the api implementation.

### Build

* TestNG
	* To build this project and run the TCK tests with TestNG execute the following command `mvn clean install`
   * With TestNG the TCK tests are enabled with the file `tck-tests.xml`

* JUnit
	* To build this project and run the TCK tests with JUnit execute the following command `mvn clean install -Pjunit`
   * With JUnit the TCK tests are "unpacked" with the **maven-dependency-plugin**
