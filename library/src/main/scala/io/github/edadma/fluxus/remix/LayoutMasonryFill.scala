/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * LayoutMasonryFill icon from the Remix Icon library, Design category.
 */
case class LayoutMasonryFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * LayoutMasonryFill icon component.
 *
 * @example LayoutMasonryFill <> LayoutMasonryFillProps(size = 24, color = "blue")
 */
def LayoutMasonryFill = (props: LayoutMasonryFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22 9.999V20C22 20.5523 21.5523 21 21 21H13V9.999H22ZM11 15.999V21H3C2.44772 21 2 20.5523 2 20V15.999H11ZM11 3V13.999H2V4C2 3.44772 2.44772 3 3 3H11ZM21 3C21.5523 3 22 3.44772 22 4V7.999H13V3H21Z")
  )
}
