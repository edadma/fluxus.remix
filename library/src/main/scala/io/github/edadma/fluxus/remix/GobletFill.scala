/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * GobletFill icon from the Remix Icon library, Food category.
 */
case class GobletFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * GobletFill icon component.
 *
 * @example GobletFill <> GobletFillProps(size = 24, color = "blue")
 */
def GobletFill = (props: GobletFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 19V13.8889L3 5V3H21V5L13 13.8889V19H18V21H6V19H11ZM7.49073 7H16.5093L18.3093 5H5.69072L7.49073 7Z")
  )
}
