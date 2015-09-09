Example project of Scarango driver
==================================

Example of using Scarango: Scala driver for ArangoDB.

Functionality:

* Getting version
* Create/Drop Database
* Create/List/Drop Collection
* Create/Read/Drop Document

This example use Scarango **v0.2.3** and works best with ArangoDB **v2.6.7**

Usage
-----

**TL;DR** Open and run

* Clone/download this project
* Option 1: Open with Intellij IDEA:
 * Import project (use auto import)
 * Click run on src/main/scala/example/Main
 * Update files in `src/` and `project/build.scala`
* Option 2: Open with sbt
 * Go to project directory and execute "sbt"
 * When loaded, type `run`
* You should see `[INFO]` messages from driver and `[OK]` messages from example

Reference
---------

* [Scarango](https://github.com/aurelijusb/scarango)
* [ArangoDB](https://www.arangodb.com/)

Example is derived from [Scarango test file](https://github.com/aurelijusb/scarango/blob/master/src/main/scala/com/auginte/scarango/Main.scala).

License?
--------

Example itself have no restrictions.
Driver and database have permissive Apache 2.0 license.
