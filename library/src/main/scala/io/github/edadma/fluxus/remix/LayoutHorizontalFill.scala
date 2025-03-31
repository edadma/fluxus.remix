/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * LayoutHorizontalFill icon from the Remix Icon library, Design category.
 */
case class LayoutHorizontalFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * LayoutHorizontalFill icon component.
 *
 * @example LayoutHorizontalFill <> LayoutHorizontalFillProps(size = 24, color = "blue")
 */
def LayoutHorizontalFill = (props: LayoutHorizontalFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 3C3.44772 3 3 3.44772 3 4V20C3 20.5523 3.44772 21 4 21H20C20.5523 21 21 20.5523 21 20V4C21 3.44772 20.5523 3 20 3H4ZM7 9V7H17V9H7ZM7 13V11H17V13H7ZM17 17H7V15H17V17Z")
  )
}
