/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * WubiInput icon from the Remix Icon library, Editor category.
 */
case class WubiInputProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * WubiInput icon component.
 *
 * @example WubiInput <> WubiInputProps(size = 24, color = "blue")
 */
def WubiInput = (props: WubiInputProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 21V19H6.662L7.896 12H5V10H8.249L9.13 5H4V3H20V5H11.161L10.279 10H18V19H21V21H3ZM16 12H9.927L8.692 19H16V12Z")
  )
}
