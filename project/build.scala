import sbt.Keys._
import sbt._

object build extends sbt.Build {
  // Change your project name
  val buildName = "scarango-example"

  // Change your project version
  val buildVersion = "0.0.1"

  // Scarango like cutting edge technologies
  val buildScalaVersion = "2.11.7"

  // To keep you code clean
  val buildOptions = Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8")

  // Main line for project to work
  val buildDependencies = Seq(
    "com.auginte" %% "scarango" % "0.2.4"
  )

  // Needed while driver is not synced with Maven Central
  val scarangoAtSonatype = Seq(
    "Sonatype OOS" at "https://oss.sonatype.org/content/repositories/releases"
  )

  // Your project (this notation will helps scaling to multi-project setup)
  lazy val scarangoExample = project in file(".") settings(
    name := buildName,
    version := buildVersion,
    scalaVersion := buildScalaVersion,
    scalacOptions := buildOptions,
    mainClass := Some("example.Main"), // Change your main class here 
    resolvers ++= scarangoAtSonatype,
    libraryDependencies ++= buildDependencies
    )
}
