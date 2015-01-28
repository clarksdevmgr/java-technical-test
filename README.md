Clarks Java Developer Technical Test
====================================

Task
----

Add a REST service for querying the sample set of products included in the application. The service should respond
to the following URLs:

* `GET /products` - retrieve all products
* `GET /products/<id>` - retrieve specific product by _id_
* `PUT /products/<id>` - update an existing product identified by _id_

The service MUST accept and return resources in JSON format. Support for other formats, such as XML and HTML are
optional. Design the JSON schema you feel is appropriate given the existing data structure.

Add any necessary unit or integration tests.

You may use any IDE or text editor you are comfortable with. You are encouraged to add any open source third-party
library (must be available on Maven Central) that you feel makes your task easier. You may make any structural
changes to the project that you see fit.


Quick start
-----------
1. `mvn package`
2. `java -jar target/technical-test-1.0-SNAPSHOT.war`
3. Point your browser to [http://localhost:8080/](http://localhost:8080/)

