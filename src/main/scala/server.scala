import unfiltered.jetty._
import unfiltered.util.Port
object Server {
  def main(args: Array[String]) {
    val here = new java.io.File(".here")
    here.deleteOnExit
    here.createNewFile
    unfiltered.jetty.Http(Port.any).resources(new java.net.URL(here.toURL, ".")).run
  }
}
