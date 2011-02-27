package unplanned

import unfiltered.jetty._
import unfiltered.util.Port

object Server {
  class Instance(args: Array[String]) {
    val here = new java.io.File(".here")
    here.deleteOnExit
    here.createNewFile
    val svr = unfiltered.jetty.Http(args match {
      case Array("-p", PortOpt(port)) => port.toInt
      case _ => Port.any
    }).resources(new java.net.URL(here.toURI.toURL, "."))

    def run(afterRun: Http => Unit) = svr.run(afterRun)
  }

  def instance(args: Array[String]) = new Instance(args)
  val PortOpt = """(\d{4})""".r
  def main(args: Array[String]) {
    instance(args).run( _ => ())
  }
}
