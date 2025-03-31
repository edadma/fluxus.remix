/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowTurnForwardFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowTurnForwardFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowTurnForwardFill icon component.
 *
 * @example ArrowTurnForwardFill <> ArrowTurnForwardFillProps(size = 24, color = "blue")
 */
def ArrowTurnForwardFill = (props: ArrowTurnForwardFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 8V13C17 16.3137 14.3137 19 11 19C7.68629 19 5 16.3137 5 13V4H3V13C3 17.4183 6.58172 21 11 21C15.4183 21 19 17.4183 19 13V8H23L18 2L13 8H17Z")
  )
}
