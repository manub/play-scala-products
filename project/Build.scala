import sbt._

object ApplicationBuild extends Build {

  val appName         = "products"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "net.sf.barcode4j" % "barcode4j" % "2.0"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
