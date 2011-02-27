package unplanned

class UnplannedScript extends xsbti.AppMain {
  case class Exit(val code: Int) extends xsbti.Exit

  def run(config: xsbti.AppConfiguration) = {
    Server.instance(config.arguments).run({
      _ => Exit(0)
    })
    // hrm?
    Exit(0)
  }
}
