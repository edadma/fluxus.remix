ThisBuild / licenses += "ISC"      -> url("https://opensource.org/licenses/ISC")
ThisBuild / versionScheme          := Some("semver-spec")
ThisBuild / evictionErrorLevel     := Level.Warn
ThisBuild / scalaVersion           := "3.6.4"
ThisBuild / organization           := "io.github.edadma"
ThisBuild / organizationName       := "edadma"
ThisBuild / organizationHomepage   := Some(url("https://github.com/edadma"))
ThisBuild / version                := "0.0.2"
ThisBuild / sonatypeCredentialHost := "s01.oss.sonatype.org"
ThisBuild / sonatypeRepository     := "https://s01.oss.sonatype.org/service/local"

ThisBuild / publishConfiguration := publishConfiguration.value.withOverwrite(true).withChecksums(Vector.empty)
ThisBuild / resolvers ++= Seq(Resolver.mavenLocal)
ThisBuild / resolvers ++= Resolver.sonatypeOssRepos("snapshots") ++ Resolver.sonatypeOssRepos("releases")

ThisBuild / sonatypeProfileName := "io.github.edadma"

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/edadma/fluxus.remix"),
    "scm:git@github.com:edadma/fluxus.remix.git",
  ),
)
ThisBuild / developers := List(
  Developer(
    id = "edadma",
    name = "Edward A. Maxedon, Sr.",
    email = "edadma@gmail.com",
    url = url("https://github.com/edadma"),
  ),
)

ThisBuild / homepage := Some(url("https://github.com/edadma/fluxus.remix"))

ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://s01.oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true

lazy val commonSettings = Seq(
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-unchecked",
    "-Xfatal-warnings",
  ),
  scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) },
//  scalaJSLinkerConfig ~= { _.withModuleSplitStyle(ModuleSplitStyle.SmallestModules) },
  scalaJSLinkerConfig ~= { _.withSourceMap(false) },
)

lazy val library = project
  .enablePlugins(ScalaJSPlugin)
  .settings(commonSettings)
  .settings(
    name        := "fluxus.remix",
    description := "An integration of the Remix Icons for Fluxus",
    libraryDependencies ++= Seq(
      "io.github.edadma" %%% "fluxus" % "0.0.8",
    ),
    jsEnv                                  := new org.scalajs.jsenv.nodejs.NodeJSEnv(),
    scalaJSUseMainModuleInitializer        := true,
    Test / scalaJSUseMainModuleInitializer := true,
    Test / scalaJSUseTestModuleInitializer := false,
//    Test / scalaJSUseMainModuleInitializer := false,
//    Test / scalaJSUseTestModuleInitializer := true,
    Test / parallelExecution := false,
    publishMavenStyle        := true,
    Test / publishArtifact   := false,
  )

lazy val examples = project
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(library % "compile->compile;test->test")
  .settings(commonSettings)
  .settings(
    name := "examples",
    libraryDependencies ++= Seq(
      "io.github.edadma" %%% "fluxus" % "0.0.8",
    ),
    scalaJSUseMainModuleInitializer := true,
    publish / skip                  := true,
    publishLocal / skip             := true,
  )

lazy val fluxus_remix = project
  .in(file("."))
  .aggregate(library, examples)
  .settings(
    publish / skip := true,
  )
