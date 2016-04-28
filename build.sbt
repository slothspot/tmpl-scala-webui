name := "[STUB]"

version := "SNAPSHOT"

organization := "name.dmitrym"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.7.2" % "test"
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
