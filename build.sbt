name := """play-scala-with-docker-and-kurberetes"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.15"
libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test

enablePlugins(DockerPlugin)
dockerBaseImage := "openjdk:21" // or your preferred base image
dockerExposedPorts := Seq(9000) // Expose necessary ports
enablePlugins(DockerPlugin)
