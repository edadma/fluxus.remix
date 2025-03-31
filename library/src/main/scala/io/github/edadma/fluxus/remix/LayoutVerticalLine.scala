/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * LayoutVerticalLine icon from the Remix Icon library, Design category.
 */
case class LayoutVerticalLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * LayoutVerticalLine icon component.
 *
 * @example LayoutVerticalLine <> LayoutVerticalLineProps(size = 24, color = "blue")
 */
def LayoutVerticalLine = (props: LayoutVerticalLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5 19H19V5H5V19ZM3 4C3 3.44772 3.44772 3 4 3H20C20.5523 3 21 3.44772 21 4V20C21 20.5523 20.5523 21 20 21H4C3.44772 21 3 20.5523 3 20V4ZM15 7V17H17V7H15ZM11 7L11 17H13V7H11ZM7 17L7 7L9 7L9 17H7Z")
  )
}
