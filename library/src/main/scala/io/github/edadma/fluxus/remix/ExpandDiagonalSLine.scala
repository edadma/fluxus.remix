/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandDiagonalSLine icon from the Remix Icon library, Arrows category.
 */
case class ExpandDiagonalSLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandDiagonalSLine icon component.
 *
 * @example ExpandDiagonalSLine <> ExpandDiagonalSLineProps(size = 24, color = "blue")
 */
def ExpandDiagonalSLine = (props: ExpandDiagonalSLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.5858 7H12V5H19V12H17V8.41421L8.41421 17H12V19H5V12H7V15.5858L15.5858 7Z")
  )
}
