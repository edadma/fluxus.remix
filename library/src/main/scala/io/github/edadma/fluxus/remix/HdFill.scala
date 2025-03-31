/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * HdFill icon from the Remix Icon library, Media category.
 */
case class HdFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * HdFill icon component.
 *
 * @example HdFill <> HdFillProps(size = 24, color = "blue")
 */
def HdFill = (props: HdFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 3H21C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3ZM7.5 11.25V9H6V15H7.5V12.75H9.5V15H11V9H9.5V11.25H7.5ZM14.5 10.5H16C16.2761 10.5 16.5 10.7239 16.5 11V13C16.5 13.2761 16.2761 13.5 16 13.5H14.5V10.5ZM13 9V15H16C17.1046 15 18 14.1046 18 13V11C18 9.89543 17.1046 9 16 9H13Z")
  )
}
