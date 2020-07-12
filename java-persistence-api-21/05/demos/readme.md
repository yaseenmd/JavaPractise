# Module 04: Relationships and Inheritance

In this module you will learn how to map and apply CRUD operations on different sorts of relationships and inheritance between entities.

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

* Demo 01 only looks at the mapping side of relationships. This demo has a one-to-many unidirectional relationship between `CD` and `Musician`.
* Demo 02 use the same relationship between `CD` and `Musician` but adds CRUD operations with event cascading.
* Demo 03 deals with inheritance mapping between the `CD`, `Book` and `Item` entities.


*To execute the `Main` classes, compile the code first using `mvn compile` and then use the `mvn exec:java` Maven goal. But make sure to choose the appropriate `Main` class in the `pom.xml` under the `exec-maven-plugin` configuration.*
