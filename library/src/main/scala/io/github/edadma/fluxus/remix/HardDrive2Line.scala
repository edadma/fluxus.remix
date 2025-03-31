/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * HardDrive2Line icon from the Remix Icon library, Device category.
 */
case class HardDrive2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * HardDrive2Line icon component.
 *
 * @example HardDrive2Line <> HardDrive2LineProps(size = 24, color = "blue")
 */
def HardDrive2Line = (props: HardDrive2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5 14H19V4H5V14ZM5 16V20H19V16H5ZM4 2H20C20.5523 2 21 2.44772 21 3V21C21 21.5523 20.5523 22 20 22H4C3.44772 22 3 21.5523 3 21V3C3 2.44772 3.44772 2 4 2ZM15 17H17V19H15V17Z")
  )
}
