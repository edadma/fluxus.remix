/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BarcodeFill icon from the Remix Icon library, Device category.
 */
case class BarcodeFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BarcodeFill icon component.
 *
 * @example BarcodeFill <> BarcodeFillProps(size = 24, color = "blue")
 */
def BarcodeFill = (props: BarcodeFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 4H4V20H2V4ZM6 4H8V20H6V4ZM9 4H12V20H9V4ZM13 4H15V20H13V4ZM16 4H18V20H16V4ZM19 4H22V20H19V4Z")
  )
}
