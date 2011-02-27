package unplanned

import unfiltered.jetty._
import unfiltered.util.Port

object Server {
  val PortOpt = """(\d{4})""".r
  def main(args: Array[String]) {
    val here = new java.io.File(".here")
    here.deleteOnExit
    here.createNewFile
    unfiltered.jetty.Http(args match {
      case Array("-p", PortOpt(port)) => port.toInt
      case _ => Port.any
    }).resources(new java.net.URL(here.toURI.toURL, ".")).run
  }
}
