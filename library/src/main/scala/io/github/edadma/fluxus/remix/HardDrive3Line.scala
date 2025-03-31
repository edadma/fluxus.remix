/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * HardDrive3Line icon from the Remix Icon library, Device category.
 */
case class HardDrive3LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * HardDrive3Line icon component.
 *
 * @example HardDrive3Line <> HardDrive3LineProps(size = 24, color = "blue")
 */
def HardDrive3Line = (props: HardDrive3LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.50772 2.87597C4.57028 2.37554 4.99568 2 5.5 2H18.5C19.0043 2 19.4297 2.37554 19.4923 2.87597L20.9923 14.876C20.9974 14.9171 21 14.9585 21 15V21C21 21.5523 20.5523 22 20 22H4C3.44772 22 3 21.5523 3 21V15C3 14.9585 3.00258 14.9171 3.00772 14.876L4.50772 2.87597ZM6.38278 4L5.13278 14H18.8672L17.6172 4H6.38278ZM19 16H5V20H19V16ZM15 17H17V19H15V17ZM13 17H11V19H13V17Z")
  )
}
