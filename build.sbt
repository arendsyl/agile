ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"
lazy val http4sVersion = "0.23.16"
lazy val circeVersion = "0.14.3"

lazy val root = (project in file("."))
  .settings(
    name := "tournament",
    idePackagePrefix := Some("fr.cytech.icc"),
    libraryDependencies ++= Seq(
      "org.http4s" %% "http4s-ember-server" % http4sVersion,
      "org.http4s" %% "http4s-ember-client" % http4sVersion,
      "org.http4s" %% "http4s-circe" % http4sVersion,
      "org.http4s" %% "http4s-dsl" % http4sVersion,

      "io.circe"   %% "circe-generic" % circeVersion,
      "org.scalatest" %% "scalatest" % "3.2.14"
    )
  )
