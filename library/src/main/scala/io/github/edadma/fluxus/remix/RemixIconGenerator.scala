package io.github.edadma.fluxus.remix

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.util.matching.Regex

// Node.js imports
@js.native
@JSImport("fs", JSImport.Namespace)
object fs extends js.Object {
  def readdirSync(path: String): js.Array[String]                               = js.native
  def readFileSync(path: String, options: String): String                       = js.native
  def statSync(path: String): Stats                                             = js.native
  def existsSync(path: String): Boolean                                         = js.native
  def mkdirSync(path: String, options: js.Dynamic = js.Dynamic.literal()): Unit = js.native
  def writeFileSync(path: String, data: String): Unit                           = js.native
}

@js.native
trait Stats extends js.Object {
  def isDirectory(): Boolean = js.native
}

@js.native
@JSImport("path", JSImport.Namespace)
object path extends js.Object {
  def join(paths: String*): String                     = js.native
  def basename(path: String, ext: String = ""): String = js.native
  def dirname(path: String): String                    = js.native
  def relative(from: String, to: String): String       = js.native
}

/** Generator for Remix Icon components for the Fluxus framework
  *
  * This icon set is from Remix Icon library (https://remixicon.com/) Licensed under the Apache License 2.0
  * https://github.com/Remix-Design/RemixIcon/blob/master/License
  */
object RemixIconGenerator {
  // Regex to extract SVG path data
  val pathRegex: Regex = """<path\s+d="([^"]+)".*?>""".r

  // Config
  val svgDir = "/home/ed/Downloads/RemixIcon_Svg_v4.6.0"
  val outputDir =
    "/home/ed/dev/fluxus.remix/library/src/main/scala/io/github/edadma/fluxus/remix" // Output directory for generated files
  val packageName = "io.github.edadma.fluxus.remix"

  // License header to include in each file
  val licenseHeader =
    """/**
      | * This icon is part of Remix Icon library (https://remixicon.com/)
      | * Licensed under the Apache License 2.0
      | * https://github.com/Remix-Design/RemixIcon/blob/master/License
      | */
      |""".stripMargin

  def main(args: Array[String]): Unit = {
    println("Starting Remix Icon generator for Fluxus...")

    // Ensure output directory exists
    if (!fs.existsSync(outputDir)) {
      println(s"Creating output directory: $outputDir")
      fs.mkdirSync(outputDir, js.Dynamic.literal(recursive = true))
    }

    // Generate icon components
    val iconCount = processDirectory(svgDir)
    generateIndexFile()

    println(s"Successfully generated $iconCount Remix Icon components")
  }

  def processDirectory(dir: String): Int = {
    var totalIcons = 0
    val entries    = fs.readdirSync(dir)

    entries.foreach { entry =>
      val entryPath = path.join(dir, entry)
      val stats     = fs.statSync(entryPath)

      if (stats.isDirectory()) {
        // Process subdirectory
        println(s"Processing directory: $entry")
        totalIcons += processDirectory(entryPath)
      } else if (entry.endsWith(".svg")) {
        // Process SVG file
        val category = path.basename(path.dirname(entryPath))
        generateIconComponent(entryPath, category, entry)
        totalIcons += 1
      }
    }

    totalIcons
  }

  def generateIconComponent(filePath: String, category: String, iconFile: String): Unit = {
    val svgContent = fs.readFileSync(filePath, "utf8")

    // Extract path data using regex
    val pathData = pathRegex.findFirstMatchIn(svgContent) match {
      case Some(m) => m.group(1)
      case None =>
        println(s"Warning: Could not extract path data from $filePath")
        return
    }

    // Generate component name (CamelCase)
    val baseName      = path.basename(iconFile, ".svg")
    val componentName = toCamelCase(baseName)

    // Generate file content
    val fileContent = generateComponentCode(componentName, pathData, category)

    // Write to file
    val outputFile = path.join(outputDir, s"$componentName.scala")
    fs.writeFileSync(outputFile, fileContent)

    println(s"Generated icon: $componentName")
  }

  def generateComponentCode(componentName: String, pathData: String, category: String): String = {
    s"""$licenseHeader
       |package $packageName
       |
       |import io.github.edadma.fluxus._
       |
       |/**
       | * $componentName icon from the Remix Icon library, $category category.
       | */
       |case class ${componentName}Props(
       |  size: Int = 24,
       |  color: String = "currentColor",
       |  className: String = ""
       |)
       |
       |/**
       | * $componentName icon component.
       | *
       | * @example $componentName <> ${componentName}Props(size = 24, color = "blue")
       | */
       |def $componentName = (props: ${componentName}Props) => {
       |  svg(
       |    viewBox := "0 0 24 24",
       |    xmlns := "http://www.w3.org/2000/svg",
       |    width := props.size.toString,
       |    height := props.size.toString,
       |    fill := props.color,
       |    cls := props.className,
       |    path(d := "$pathData")
       |  )
       |}
       |""".stripMargin
  }

  def generateIndexFile(): Unit = {
    val files = fs.readdirSync(outputDir)
      .filter(_.endsWith(".scala"))
      .map(f => path.basename(f, ".scala"))
      .filter(name => name != "index" && name != "package")

    val indexContent =
      s"""$licenseHeader
         |package $packageName
         |
         |/**
         | * Remix Icon components for Fluxus framework
         | */
         |""".stripMargin

    val outputFile = path.join(outputDir, "package.scala")
    fs.writeFileSync(outputFile, indexContent)
  }

  // Helper to convert kebab-case or snake_case to CamelCase
  def toCamelCase(str: String): String = {
    // Replace hyphens and underscores with spaces, then capitalize each word
    val words = str.replace('-', ' ').replace('_', ' ').split(" ")
    words.map(_.capitalize).mkString
  }
}

// Script entry point
@JSExportTopLevel("main")
def main(): Unit = {
  RemixIconGenerator.main(Array())
}
