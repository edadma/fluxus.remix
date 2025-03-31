/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandDiagonalSFill icon from the Remix Icon library, Arrows category.
 */
case class ExpandDiagonalSFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandDiagonalSFill icon component.
 *
 * @example ExpandDiagonalSFill <> ExpandDiagonalSFillProps(size = 24, color = "blue")
 */
def ExpandDiagonalSFill = (props: ExpandDiagonalSFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19 5H11.5L14.5429 8.04289L8.04289 14.5429L5 11.5V19H12.5L9.45711 15.9571L15.9571 9.45711L19 12.5V5Z")
  )
}
