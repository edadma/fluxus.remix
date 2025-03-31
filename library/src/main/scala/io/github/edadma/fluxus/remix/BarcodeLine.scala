/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BarcodeLine icon from the Remix Icon library, Device category.
 */
case class BarcodeLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BarcodeLine icon component.
 *
 * @example BarcodeLine <> BarcodeLineProps(size = 24, color = "blue")
 */
def BarcodeLine = (props: BarcodeLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 4H4V20H2V4ZM6 4H7V20H6V4ZM8 4H10V20H8V4ZM11 4H13V20H11V4ZM14 4H16V20H14V4ZM17 4H18V20H17V4ZM19 4H22V20H19V4Z")
  )
}
