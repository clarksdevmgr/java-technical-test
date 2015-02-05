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
library (must be available on [Maven Central](http://search.maven.org/#browse)) that you feel makes your task easier. You may make any structural changes to the project that you see fit.


Requirements
------------

* Java 1.8 ([JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html))
* [Maven 3.x](http://maven.apache.org/download.cgi) 


Quick start
-----------

1. Clone repository 
2. `mvn package`
3. `java -jar target/technical-test-1.0-SNAPSHOT.war`
4. Point your browser to [http://localhost:8080/](http://localhost:8080/)


Submitting your work
--------------------

Create a git bundle using the naming convention _yourname_.technical-test.bundle - for example:

`git bundle create fredbloggs.technical-test.bundle --all`

Email the file created to the email address you will have been given at the start of the interview process.


Advice
------

* Timebox the effort you put into this task; work out how much time you can afford to spend on this process and stick to it. Given the open-ended nature of tasks like this the temptation is there to toil away for hours and hours; don't.
* This is not an attempt to trick you as a developer; there is no absolute right or wrong answer.
* Commit early and often; this gives us a good idea how your thought processes work as a developer.
* Check before you email! Make sure you can extract the bundle and build the application from a command line before sending. Hint: have a look at the [documentation for git bundle](http://git-scm.com/docs/git-bundle "Git Bundle") if you're unsure how to do this.

Good luck, and we look forward to seeing your submission.