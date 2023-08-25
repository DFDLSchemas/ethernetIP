name := "dfdl-ethernetIP"

organization := "com.owlcyberdefense"

version := "1.3.0"

scalaVersion := "2.12.18"
 
libraryDependencies ++= Seq(
  "org.apache.daffodil" %% "daffodil-lib" % "3.5.0",
  "org.apache.daffodil" %% "daffodil-runtime1" % "3.5.0",
  "org.apache.daffodil" %% "daffodil-runtime1-layers" % "3.5.0",
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.5.0" % "test",
  "junit" % "junit" % "4.13.2" % "test",
  "com.github.sbt" % "junit-interface" % "0.13.3" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false
