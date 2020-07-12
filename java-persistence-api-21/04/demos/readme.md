# Module 03: Managing Elementary Entities with JPA

In this module the author will introduce CRUD operations with the EntityManager, as well as elementary mapping annotations, XML, and its equivalent in the relational database.

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

* Demo 01 and 02 both do CRUd operations on a `Book` entity but using different coding technics. Under the `demo01` package the `Main` class is the one invoking the `EntityManager` and doing the transaction management, while under the `demo02` package it's the `BookService` that does it.
* Demo 03 doesn't rely on default mapping and adds mapping annotations on attributes to customize the mapping of the `Author` entity.
* On Demo 04 the mapping metadata is done with annotations on the getters as well as in the XML descriptor. The `CD` entity has is mapped differently in development and test environment thanks to two different persistence unit.


*To execute the `Main` classes, compile the code first using `mvn compile` and then use the `mvn exec:java` Maven goal. But make sure to choose the appropriate `Main` class in the `pom.xml` under the `exec-maven-plugin` configuration.*
