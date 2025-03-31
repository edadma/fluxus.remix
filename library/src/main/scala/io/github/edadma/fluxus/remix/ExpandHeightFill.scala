/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandHeightFill icon from the Remix Icon library, Arrows category.
 */
case class ExpandHeightFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandHeightFill icon component.
 *
 * @example ExpandHeightFill <> ExpandHeightFillProps(size = 24, color = "blue")
 */
def ExpandHeightFill = (props: ExpandHeightFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18 2H6V4H18V2ZM16.9497 9.44975L12 4.5L7.05273 9.44727L11 9.44826V14.5501L7.05078 14.55L12.0005 19.5L16.9502 14.5503L13 14.5502V9.44876L16.9497 9.44975ZM18 20V22H6V20H18Z")
  )
}
