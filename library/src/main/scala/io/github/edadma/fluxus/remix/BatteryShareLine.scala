/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BatteryShareLine icon from the Remix Icon library, Device category.
 */
case class BatteryShareLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BatteryShareLine icon component.
 *
 * @example BatteryShareLine <> BatteryShareLineProps(size = 24, color = "blue")
 */
def BatteryShareLine = (props: BatteryShareLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14 2C14.5523 2 15 2.44772 15 3V4H18C18.5523 4 19 4.44772 19 5V7H17V6H13V4H11V6H7V20H17V17H19V21C19 21.5523 18.5523 22 18 22H6C5.44772 22 5 21.5523 5 21V5C5 4.44772 5.44772 4 6 4H9V3C9 2.44772 9.44772 2 10 2H14ZM15 8L20 12L15 16V13H14C12.9456 13 12 13.95 12 15V18H10V15C10 12.7909 11.7909 11 14 11H15V8Z")
  )
}
