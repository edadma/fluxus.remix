/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ClockwiseFill icon from the Remix Icon library, Design category.
 */
case class ClockwiseFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ClockwiseFill icon component.
 *
 * @example ClockwiseFill <> ClockwiseFillProps(size = 24, color = "blue")
 */
def ClockwiseFill = (props: ClockwiseFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 10H23L19 15L15 10H18V8C18 6.34315 16.6569 5 15 5H11V3H15C17.7614 3 20 5.23858 20 8V10ZM13 9C13.5523 9 14 9.44772 14 10V20C14 20.5523 13.5523 21 13 21H3C2.44772 21 2 20.5523 2 20V10C2 9.44772 2.44772 9 3 9H13Z")
  )
}
