/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SignalWifi3Fill icon from the Remix Icon library, Device category.
 */
case class SignalWifi3FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SignalWifi3Fill icon component.
 *
 * @example SignalWifi3Fill <> SignalWifi3FillProps(size = 24, color = "blue")
 */
def SignalWifi3Fill = (props: SignalWifi3FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.0005 3C16.2849 3 20.2196 4.49683 23.3104 6.99607L12.0005 21L0.689941 6.99671C3.78078 4.49709 7.71583 3 12.0005 3ZM12.0005 5C8.97296 5 6.07788 5.84185 3.57997 7.39179L5.48439 9.74853C7.40016 8.63663 9.626 8 12.0005 8C14.3751 8 16.6011 8.63667 18.5169 9.74863L20.4204 7.39132C17.9226 5.84167 15.0278 5 12.0005 5Z")
  )
}
