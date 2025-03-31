/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * LogoutBoxRFill icon from the Remix Icon library, System category.
 */
case class LogoutBoxRFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * LogoutBoxRFill icon component.
 *
 * @example LogoutBoxRFill <> LogoutBoxRFillProps(size = 24, color = "blue")
 */
def LogoutBoxRFill = (props: LogoutBoxRFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5 22C4.44772 22 4 21.5523 4 21V3C4 2.44772 4.44772 2 5 2H19C19.5523 2 20 2.44772 20 3V21C20 21.5523 19.5523 22 19 22H5ZM15 16L20 12L15 8V11H9V13H15V16Z")
  )
}
