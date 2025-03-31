/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DeviceLine icon from the Remix Icon library, Device category.
 */
case class DeviceLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DeviceLine icon component.
 *
 * @example DeviceLine <> DeviceLineProps(size = 24, color = "blue")
 */
def DeviceLine = (props: DeviceLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19 8H21C21.5523 8 22 8.44772 22 9V21C22 21.5523 21.5523 22 21 22H13C12.4477 22 12 21.5523 12 21V20H4C3.44772 20 3 19.5523 3 19V3C3 2.44772 3.44772 2 4 2H18C18.5523 2 19 2.44772 19 3V8ZM17 8V4H5V18H12V9C12 8.44772 12.4477 8 13 8H17ZM14 10V20H20V10H14Z")
  )
}
