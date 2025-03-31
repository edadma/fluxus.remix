/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Clockwise2Line icon from the Remix Icon library, Design category.
 */
case class Clockwise2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Clockwise2Line icon component.
 *
 * @example Clockwise2Line <> Clockwise2LineProps(size = 24, color = "blue")
 */
def Clockwise2Line = (props: Clockwise2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10.5858 3.99997L8.75736 2.17154L10.1716 0.757324L14.4142 4.99997L10.1716 9.24261L8.75736 7.82839L10.5858 5.99997H8C6.34315 5.99997 5 7.34311 5 8.99997V13H3V8.99997C3 6.23854 5.23858 3.99997 8 3.99997H10.5858ZM9 11C9 10.4477 9.44772 9.99997 10 9.99997H20C20.5523 9.99997 21 10.4477 21 11V21C21 21.5522 20.5523 22 20 22H10C9.44772 22 9 21.5522 9 21V11ZM11 12V20H19V12H11Z")
  )
}
