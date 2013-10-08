//
// Fundus - a cross platform application/game framework for Scala
// Copyright (c) 2013, Michael Bayne - All rights reserved.
// http://github.com/samskivert/fundus/blob/master/LICENSE

import sbt._
import Keys._

object FundusBuild extends samskivert.MavenBuild {

  override val globalSettings = Seq(
    crossPaths    := false,
    scalacOptions ++= Seq("-unchecked", "-deprecation"),
    autoScalaLibrary := false, // we manually add scala-library in our POMs
    fork in Compile := true,
    libraryDependencies ++= Seq(
      "com.novocode" % "junit-interface" % "0.10" % "test" // make junit work
    ),
    testOptions += Tests.Argument(TestFrameworks.JUnit, "-a", "-v")
  )

  override def moduleSettings (name :String, pom :pomutil.POM) = name match {
    case _ => Nil // nothing for now
  }
}
