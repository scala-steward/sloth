import sbt._
import Keys._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

object Deps {
  import Def.{setting => dep}

  val scalaTest = dep("org.scalatest" %%% "scalatest" % "3.2.18")

  val scalaReflect = dep("org.scala-lang" % "scala-reflect")
  val cats = dep("org.typelevel" %%% "cats-core" % "2.12.0")
  val chameleon = dep("com.github.cornerman" %%% "chameleon" % "0.3.7")

  val zioJson = dep("dev.zio" %%% "zio-json" % "0.7.0")

  val circe = new {
    private val version = "0.14.1"
    val core = dep("io.circe" %%% "circe-core" % version)
    val generic = dep("io.circe" %%% "circe-generic" % version)
    val parser = dep("io.circe" %%% "circe-parser" % version)
    val shapes = dep("io.circe" %%% "circe-shapes" % version)
  }
}
