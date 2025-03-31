/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SignalWifiErrorLine icon from the Remix Icon library, Device category.
 */
case class SignalWifiErrorLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SignalWifiErrorLine icon component.
 *
 * @example SignalWifiErrorLine <> SignalWifiErrorLineProps(size = 24, color = "blue")
 */
def SignalWifiErrorLine = (props: SignalWifiErrorLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.0005 3C16.2849 3 20.2196 4.49683 23.3104 6.99607L22.0539 8.55224C19.3066 6.33059 15.809 5 12.0005 5C8.91158 5 6.02706 5.87535 3.58152 7.39152L12.0005 17.8169L17.9999 10.388V13.571L12.0005 21L0.689941 6.99671C3.78078 4.49709 7.71583 3 12.0005 3ZM22.0005 19V21H20.0005V19H22.0005ZM22.0005 10V17H20.0005V10H22.0005Z")
  )
}
