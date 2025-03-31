/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SignalWifi1Line icon from the Remix Icon library, Device category.
 */
case class SignalWifi1LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SignalWifi1Line icon component.
 *
 * @example SignalWifi1Line <> SignalWifi1LineProps(size = 24, color = "blue")
 */
def SignalWifi1Line = (props: SignalWifi1LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.0005 3C16.2849 3 20.2196 4.49683 23.3104 6.99607L12.0005 21L0.689941 6.99671C3.78078 4.49709 7.71583 3 12.0005 3ZM12.0005 15C11.3072 15 10.6331 15.1174 10.0002 15.3409L12.0005 17.8169L13.9999 15.34C13.3705 15.12 12.6939 15 12.0005 15ZM12.0005 5C8.97296 5 6.07788 5.84185 3.57997 7.39179L8.68885 13.7155C9.69799 13.256 10.8194 13 12.0005 13C13.1818 13 14.3032 13.256 15.3123 13.7155L20.4204 7.39132C17.9226 5.84167 15.0278 5 12.0005 5Z")
  )
}
