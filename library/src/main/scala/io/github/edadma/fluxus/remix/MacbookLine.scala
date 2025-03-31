/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MacbookLine icon from the Remix Icon library, Device category.
 */
case class MacbookLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MacbookLine icon component.
 *
 * @example MacbookLine <> MacbookLineProps(size = 24, color = "blue")
 */
def MacbookLine = (props: MacbookLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 5V16H20V5H4ZM2 4.00748C2 3.45107 2.45531 3 2.9918 3H21.0082C21.556 3 22 3.44892 22 4.00748V18H2V4.00748ZM1 19H23V21H1V19Z")
  )
}
