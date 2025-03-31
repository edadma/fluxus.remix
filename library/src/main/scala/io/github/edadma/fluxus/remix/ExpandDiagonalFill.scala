/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandDiagonalFill icon from the Remix Icon library, Arrows category.
 */
case class ExpandDiagonalFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandDiagonalFill icon component.
 *
 * @example ExpandDiagonalFill <> ExpandDiagonalFillProps(size = 24, color = "blue")
 */
def ExpandDiagonalFill = (props: ExpandDiagonalFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 3H13.5L16.5429 6.04289L13.2929 9.29289L14.7071 10.7071L17.9571 7.45711L21 10.5V3ZM3 21H10.5L7.45711 17.9571L10.7071 14.7071L9.29289 13.2929L6.04289 16.5429L3 13.5V21Z")
  )
}
