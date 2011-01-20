import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) with assembly.AssemblyBuilder {
  val ufj = "net.databinder" %% "unfiltered-jetty" % "0.3.1"
  override def assemblyJarName = "unplanned.jar"
}
