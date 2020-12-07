# Sample Quick Start Java Program

## Pre-requirements
* [Maven 3.3.6](https://archive.apache.org/dist/maven/maven-3/3.3.9/binaries/)
* [Java 1.8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)

## How to build
* Go to `excel-worksheet' directory
* Execute `mvn clean install`

**Build Output:**
```shell script
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building excel-worksheet 1.0.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ excel-worksheet ---
[INFO] Deleting excel-worksheet/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ excel-worksheet ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ excel-worksheet ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 2 source files to excel-worksheet/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ excel-worksheet ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ excel-worksheet ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to excel-worksheet/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ excel-worksheet ---
[INFO] Surefire report directory: excel-worksheet/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.h2o.excel.CellTest
Configuring TestNG with: org.apache.maven.surefire.testng.conf.TestNG652Configurator@28ba21f3
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.206 sec

Results :

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ excel-worksheet ---
[INFO] Building jar: excel-worksheet/target/excel-worksheet-1.0.0-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-assembly-plugin:3.2.0:single (default) @ excel-worksheet ---
[INFO] Building jar: excel-worksheet/target/excel-worksheet-1.0.0-SNAPSHOT-jar-with-dependencies.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ excel-worksheet ---
[INFO] Installing excel-worksheet/target/excel-worksheet-1.0.0-SNAPSHOT.jar to /Users/viduran/.m2/repository/com/h2o/excel/excel-worksheet/1.0.0-SNAPSHOT/excel-worksheet-1.0.0-SNAPSHOT.jar
[INFO] Installing excel-worksheet/pom.xml to /Users/viduran/.m2/repository/com/h2o/excel/excel-worksheet/1.0.0-SNAPSHOT/excel-worksheet-1.0.0-SNAPSHOT.pom
[INFO] Installing excel-worksheet/target/excel-worksheet-1.0.0-SNAPSHOT-jar-with-dependencies.jar to /Users/viduran/.m2/repository/com/h2o/excel/excel-worksheet/1.0.0-SNAPSHOT/excel-worksheet-1.0.0-SNAPSHOT-jar-with-dependencies.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.678 s
[INFO] Finished at: 2020-12-07T22:50:00+05:30
[INFO] Final Memory: 24M/302M
[INFO] ------------------------------------------------------------------------

```

## How to run
* Go to `excel-worksheet/target' directory, once the project build is complete
* Execute `java -jar excel-worksheet-1.0.0-SNAPSHOT-jar-with-dependencies.jar`

```shell script
java -jar excel-worksheet-1.0.0-SNAPSHOT-jar-with-dependencies.jar
Column number for cell A1 is: 1
Column number for cell Z1 is: 26
Column number for cell AZ1 is: 52
Column number for cell ZZ1 is: 702
Column number for cell AAC1 is: 705

```
