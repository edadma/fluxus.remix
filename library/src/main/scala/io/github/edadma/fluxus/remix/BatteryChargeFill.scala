/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BatteryChargeFill icon from the Remix Icon library, Device category.
 */
case class BatteryChargeFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BatteryChargeFill icon component.
 *
 * @example BatteryChargeFill <> BatteryChargeFillProps(size = 24, color = "blue")
 */
def BatteryChargeFill = (props: BatteryChargeFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 11V5L7 13H10V19L15 11H12ZM3 5H19C19.5523 5 20 5.44772 20 6V18C20 18.5523 19.5523 19 19 19H3C2.44772 19 2 18.5523 2 18V6C2 5.44772 2.44772 5 3 5ZM21 9H23V15H21V9Z")
  )
}
