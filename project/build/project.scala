import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info)
  with assembly.AssemblyBuilder with posterous.Publish {
  val ufj = "net.databinder" %% "unfiltered-jetty" % "0.3.1"
  override def assemblyJarName = "unplanned.jar"
  // for conscript
  val launchInterface = "org.scala-tools.sbt" % "launcher-interface" % "0.7.4" % "provided"
}
