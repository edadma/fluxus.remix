/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SignalWifiErrorFill icon from the Remix Icon library, Device category.
 */
case class SignalWifiErrorFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SignalWifiErrorFill icon component.
 *
 * @example SignalWifiErrorFill <> SignalWifiErrorFillProps(size = 24, color = "blue")
 */
def SignalWifiErrorFill = (props: SignalWifiErrorFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.0005 3C16.2849 3 20.2196 4.49683 23.3104 6.99607L22.4989 8H18.0005L17.9999 13.571L12.0005 21L0.689941 6.99671C3.78078 4.49709 7.71583 3 12.0005 3ZM22.0005 19V21H20.0005V19H22.0005ZM22.0005 10V17H20.0005V10H22.0005Z")
  )
}
