# Module 01: Introduction

Java Persistence API is introduced in this module and the author explains why you should use it to map your business model with the relational database.

## Code 

The code of this module follows the [Maven](http://maven.apache.org/) directory structure. The `src/main/` directory contains the main source code while you will find the test class under `src/test/`. The `pom.xml` and `assembly.xml` files are Maven specific describes the project and its dependencies.

Once [Maven](http://maven.apache.org/), [H2 Database](http://www.h2database.com) and a [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html) are installed and the database is up and running, enter the following Maven commands:

* `mvn help:help` : shows Maven help
* `mvn clean`     : cleans the `target` directory
* `mvn compile`   : compiles the code
* `mvn test`      : runs the test case (make sure the H2 database is up and running)
* `mvn exec:java` : executes the main class

## Demo 

This module contains the following demos:

* Under the `demo01` package you will find the demo without Java Persistence API doing JDBC calls to the database.
* Under the `demo02` package you will find the demo that uses Java Persistence API.


*To execute the `Main` classes, compile the code first using `mvn compile` and then use the `mvn exec:java` Maven goal. But make sure to choose the appropriate `Main` class in the `pom.xml` under the `exec-maven-plugin` configuration.*
