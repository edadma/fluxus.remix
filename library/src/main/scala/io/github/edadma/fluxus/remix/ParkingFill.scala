/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ParkingFill icon from the Remix Icon library, Map category.
 */
case class ParkingFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ParkingFill icon component.
 *
 * @example ParkingFill <> ParkingFillProps(size = 24, color = "blue")
 */
def ParkingFill = (props: ParkingFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6 3H13C16.3137 3 19 5.68629 19 9C19 12.3137 16.3137 15 13 15H10V21H6V3ZM10 7V11H13C14.1046 11 15 10.1046 15 9C15 7.89543 14.1046 7 13 7H10Z")
  )
}
