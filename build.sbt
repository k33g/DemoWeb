name := "DemoWeb"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra" % "1.5.2"
)

Revolver.settings

resolvers +=
  "Twitter" at "http://maven.twttr.com"
