/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * AlignItemLeftFill icon from the Remix Icon library, Design category.
 */
case class AlignItemLeftFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * AlignItemLeftFill icon component.
 *
 * @example AlignItemLeftFill <> AlignItemLeftFillProps(size = 24, color = "blue")
 */
def AlignItemLeftFill = (props: AlignItemLeftFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 21V3H5V21H3ZM7 14C7 13.4477 7.44772 13 8 13H16C16.5523 13 17 13.4477 17 14V19C17 19.5523 16.5523 20 16 20H8C7.44772 20 7 19.5523 7 19V14ZM8 4C7.44772 4 7 4.44772 7 5V10C7 10.5523 7.44772 11 8 11H20C20.5523 11 21 10.5523 21 10V5C21 4.44772 20.5523 4 20 4H8Z")
  )
}
