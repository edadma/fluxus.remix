/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandDiagonalS2Fill icon from the Remix Icon library, Arrows category.
 */
case class ExpandDiagonalS2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandDiagonalS2Fill icon component.
 *
 * @example ExpandDiagonalS2Fill <> ExpandDiagonalS2FillProps(size = 24, color = "blue")
 */
def ExpandDiagonalS2Fill = (props: ExpandDiagonalS2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5 5L5 12.5L8.04289 9.45711L14.5429 15.9571L11.5 19H19L19 11.5L15.9571 14.5429L9.45711 8.04289L12.5 5L5 5Z")
  )
}
