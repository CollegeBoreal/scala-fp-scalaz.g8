organization := "$organization$"

name := "$name$"

description := "$app_description$"

version := "1.0-SNAPSHOT"

lazy val root = project in file(".")

scalaVersion := "2.13.0-RC2"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0-SNAP11" % Test

scalacOptions ++= Seq(
    "-unchecked"
  , "-deprecation"
  , "-feature"
  , "-language:_"
  , "-Ypartial-unification"
  , "-Xfatal-warnings"
)



