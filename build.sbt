name := "oanda-trader"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "org.apache.httpcomponents" % "httpclient" % "4.5.3",
  "org.apache.httpcomponents" % "fluent-hc" % "4.5.3",
  "org.json4s" % "json4s-native_2.12" % "3.5.2",
  "org.json4s" % "json4s-jackson_2.12" % "3.5.2",
  "joda-time" % "joda-time" % "2.9.9",
  "org.scalatest" % "scalatest_2.12" % "3.0.3" % "test"
)