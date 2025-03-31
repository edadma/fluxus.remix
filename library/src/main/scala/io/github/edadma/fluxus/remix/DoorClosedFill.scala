/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DoorClosedFill icon from the Remix Icon library, Others category.
 */
case class DoorClosedFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DoorClosedFill icon component.
 *
 * @example DoorClosedFill <> DoorClosedFillProps(size = 24, color = "blue")
 */
def DoorClosedFill = (props: DoorClosedFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2.99805 21V19H4.99805V4C4.99805 3.44772 5.44576 3 5.99805 3H17.998C18.5503 3 18.998 3.44772 18.998 4V19H20.998V21H2.99805ZM14.998 11H12.998V13H14.998V11Z")
  )
}
