// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Sun May 17 14:50:07 CEST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
