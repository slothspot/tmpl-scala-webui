name := "[STUB]"

version := "SNAPSHOT"

organization := "name.dmitrym"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http-experimental" % "2.4.4",
  "com.typesafe.akka" %% "akka-http-jackson-experimental" % "2.4.4",
  "com.softwaremill.akka-http-session" %% "core" % "0.2.5",
  "org.mongodb.scala" %% "mongo-scala-driver" % "1.1.0",
  "org.webjars" % "font-awesome" % "4.6.1",
  "org.webjars" % "angularjs" % "1.5.5",
  "org.webjars" % "angular-ui-router" % "0.2.18",
  "org.webjars" % "angular-material" % "1.0.7",
  "org.webjars" % "angular-nvd3" % "1.0.5",
  "org.specs2" %% "specs2-core" % "3.7.2" % "test",
  "org.specs2" %% "specs2-scalacheck" % "3.7.2" % "test"
)

scalacOptions ++= Seq(
  "-deprecation", "-feature", "-optimise", "-unchecked", "-Xlint:_", "-Ydead-code", "-Yopt:_", "-Ywarn-dead-code",
  "-Ywarn-numeric-widen", "-Ywarn-unused", "-Ywarn-unused-import", "-Ywarn-value-discard"
  )

scalacOptions in Test ++= Seq(
  "-Yrangepos"
  )

javacOptions ++= Seq(
  "-deprecation", "-Xlint"
  )

incOptions := incOptions.value.withNameHashing(true)
