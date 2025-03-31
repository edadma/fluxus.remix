/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * LayoutVerticalFill icon from the Remix Icon library, Design category.
 */
case class LayoutVerticalFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * LayoutVerticalFill icon component.
 *
 * @example LayoutVerticalFill <> LayoutVerticalFillProps(size = 24, color = "blue")
 */
def LayoutVerticalFill = (props: LayoutVerticalFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 3C3.44772 3 3 3.44772 3 4V20C3 20.5523 3.44772 21 4 21H20C20.5523 21 21 20.5523 21 20V4C21 3.44772 20.5523 3 20 3H4ZM6.99993 16.9999V6.99993H8.99993V16.9999H6.99993ZM10.9999 6.99993H12.9999V16.9999H10.9999V6.99993ZM14.9999 6.99993H16.9999V16.9999H14.9999V6.99993Z")
  )
}
