name := "ScalajsProject"

version := "0.1"

scalaVersion := "2.12.7"

enablePlugins(ScalaJSPlugin)

// This is an application with a main method
scalaJSUseMainModuleInitializer := false

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0"
libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.6.2"

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()