
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Documents/SoftDev/lab4/conf/routes
// @DATE:Wed Mar 07 22:49:14 GMT 2018


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
