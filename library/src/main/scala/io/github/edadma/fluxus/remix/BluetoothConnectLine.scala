/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BluetoothConnectLine icon from the Remix Icon library, Device category.
 */
case class BluetoothConnectLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BluetoothConnectLine icon component.
 *
 * @example BluetoothConnectLine <> BluetoothConnectLineProps(size = 24, color = "blue")
 */
def BluetoothConnectLine = (props: BluetoothConnectLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14.3113 12L18.6544 16.3431L12.9976 22H10.9976V15.3137L6.63359 19.6777L5.21938 18.2635L10.9976 12.4853V11.5147L5.21938 5.73654L6.63359 4.32233L10.9976 8.68629V2H12.9976L18.6544 7.65685L14.3113 12ZM12.9976 13.5147V19.1716L15.826 16.3431L12.9976 13.5147ZM12.9976 10.4853L15.826 7.65685L12.9976 4.82843V10.4853ZM19.5 13.5C18.6716 13.5 18 12.8284 18 12C18 11.1716 18.6716 10.5 19.5 10.5C20.3284 10.5 21 11.1716 21 12C21 12.8284 20.3284 13.5 19.5 13.5ZM6.5 13.5C5.67157 13.5 5 12.8284 5 12C5 11.1716 5.67157 10.5 6.5 10.5C7.32843 10.5 8 11.1716 8 12C8 12.8284 7.32843 13.5 6.5 13.5Z")
  )
}
