/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * HotelBedFill icon from the Remix Icon library, Map category.
 */
case class HotelBedFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * HotelBedFill icon component.
 *
 * @example HotelBedFill <> HotelBedFillProps(size = 24, color = "blue")
 */
def HotelBedFill = (props: HotelBedFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22 11V20H20V17H4V20H2V4H4V14H12V7H18C20.2091 7 22 8.79086 22 11ZM8 13C6.34315 13 5 11.6569 5 10C5 8.34315 6.34315 7 8 7C9.65685 7 11 8.34315 11 10C11 11.6569 9.65685 13 8 13Z")
  )
}
