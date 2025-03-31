/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DoorFill icon from the Remix Icon library, Others category.
 */
case class DoorFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DoorFill icon component.
 *
 * @example DoorFill <> DoorFillProps(size = 24, color = "blue")
 */
def DoorFill = (props: DoorFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17.998 3C18.5503 3 18.998 3.44772 18.998 4V20C18.998 20.5523 18.5503 21 17.998 21H5.99805C5.44576 21 4.99805 20.5523 4.99805 20V4C4.99805 3.44772 5.44576 3 5.99805 3H17.998ZM13.998 11C13.4458 11 12.998 11.4477 12.998 12C12.998 12.5523 13.4458 13 13.998 13C14.5503 13 14.998 12.5523 14.998 12C14.998 11.4477 14.5503 11 13.998 11Z")
  )
}
