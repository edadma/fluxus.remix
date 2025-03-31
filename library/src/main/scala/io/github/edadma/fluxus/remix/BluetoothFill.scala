/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BluetoothFill icon from the Remix Icon library, Device category.
 */
case class BluetoothFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BluetoothFill icon component.
 *
 * @example BluetoothFill <> BluetoothFillProps(size = 24, color = "blue")
 */
def BluetoothFill = (props: BluetoothFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14.3116 12L18.6548 16.3431L12.9979 22H10.9979V15.3137L6.63394 19.6777L5.21973 18.2635L10.9979 12.4853V11.5147L5.21973 5.73654L6.63394 4.32233L10.9979 8.68629V2H12.9979L18.6548 7.65685L14.3116 12ZM12.9979 13.5147V19.1716L15.8263 16.3431L12.9979 13.5147ZM12.9979 10.4853L15.8263 7.65685L12.9979 4.82843V10.4853Z")
  )
}
