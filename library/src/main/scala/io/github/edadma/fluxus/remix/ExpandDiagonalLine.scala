/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandDiagonalLine icon from the Remix Icon library, Arrows category.
 */
case class ExpandDiagonalLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandDiagonalLine icon component.
 *
 * @example ExpandDiagonalLine <> ExpandDiagonalLineProps(size = 24, color = "blue")
 */
def ExpandDiagonalLine = (props: ExpandDiagonalLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17.5858 5H14V3H21V10H19V6.41421L14.7071 10.7071L13.2929 9.29289L17.5858 5ZM3 14H5V17.5858L9.29289 13.2929L10.7071 14.7071L6.41421 19H10V21H3V14Z")
  )
}
