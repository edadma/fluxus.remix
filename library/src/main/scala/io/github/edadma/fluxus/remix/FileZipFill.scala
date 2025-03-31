/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FileZipFill icon from the Remix Icon library, Document category.
 */
case class FileZipFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FileZipFill icon component.
 *
 * @example FileZipFill <> FileZipFillProps(size = 24, color = "blue")
 */
def FileZipFill = (props: FileZipFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10 2V4H12V2H20.0066C20.5551 2 21 2.44405 21 2.9918V21.0082C21 21.5447 20.5552 22 20.0066 22H3.9934C3.44495 22 3 21.556 3 21.0082V2.9918C3 2.45531 3.44476 2 3.9934 2H10ZM12 4V6H14V4H12ZM10 6V8H12V6H10ZM12 8V10H14V8H12ZM10 10V12H12V10H10ZM12 12V14H10V17H14V12H12Z")
  )
}
