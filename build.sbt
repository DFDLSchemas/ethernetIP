name := "dfdl-ethernetIP"

organization := "com.owlcyberdefense"

version := "1.1.0"

scalaVersion := "2.12.15"
 
libraryDependencies ++= Seq(
  "org.apache.daffodil" %% "daffodil-lib" % "3.2.1",
  "org.apache.daffodil" %% "daffodil-runtime1" % "3.2.1",
  "org.apache.daffodil" %% "daffodil-runtime1-layers" % "3.2.1",
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.2.1" % "test",
  "junit" % "junit" % "4.13.2" % "test",
  "com.github.sbt" % "junit-interface" % "0.13.2" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false
