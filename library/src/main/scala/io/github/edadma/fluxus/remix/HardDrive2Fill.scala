/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * HardDrive2Fill icon from the Remix Icon library, Device category.
 */
case class HardDrive2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * HardDrive2Fill icon component.
 *
 * @example HardDrive2Fill <> HardDrive2FillProps(size = 24, color = "blue")
 */
def HardDrive2Fill = (props: HardDrive2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 3V21C21 21.5523 20.5523 22 20 22H4C3.44772 22 3 21.5523 3 21V3C3 2.44772 3.44772 2 4 2H20C20.5523 2 21 2.44772 21 3ZM5 16V20H19V16H5ZM15 17H17V19H15V17Z")
  )
}
