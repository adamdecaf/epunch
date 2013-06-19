name := "epunch"

organization := "com.decaf"

scalaVersion := "2.10.2"

scalacOptions ++= Seq("-feature", "-deprecation")

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io"
)

libraryDependencies ++= Seq(
  "org.joda" % "joda-convert" % "1.1",
  "joda-time" % "joda-time" % "2.0",
  "com.typesafe.akka" %% "akka-actor" % "2.1.4",
  "com.typesafe.akka" %% "akka-remote" % "2.1.4",
  "com.typesafe.akka" %% "akka-slf4j" % "2.1.4",
  "io.spray" % "spray-can" % "1.1-M8",
  "io.spray" % "spray-routing" % "1.1-M8",
  "io.spray" % "spray-client" % "1.1-M8"
)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.14" % "test",
  "io.spray" % "spray-testkit" % "1.1-M8" % "test",
  "com.typesafe.akka" %% "akka-testkit" % "2.1.4" % "test"
)
