/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FileWordFill icon from the Remix Icon library, Document category.
 */
case class FileWordFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FileWordFill icon component.
 *
 * @example FileWordFill <> FileWordFillProps(size = 24, color = "blue")
 */
def FileWordFill = (props: FileWordFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 2L21 7V21.0082C21 21.556 20.5551 22 20.0066 22H3.9934C3.44476 22 3 21.5447 3 21.0082V2.9918C3 2.44405 3.44495 2 3.9934 2H16ZM14 8V12.989L12 11L10.0108 13L10 8H8V16H10L12 14L14 16H16V8H14Z")
  )
}
