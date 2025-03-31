/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ShutDownFill icon from the Remix Icon library, Device category.
 */
case class ShutDownFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ShutDownFill icon component.
 *
 * @example ShutDownFill <> ShutDownFillProps(size = 24, color = "blue")
 */
def ShutDownFill = (props: ShutDownFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 2.04938V12H13V2.04938C18.0533 2.5511 22 6.81465 22 12C22 17.5229 17.5228 22 12 22C6.47715 22 2 17.5229 2 12C2 6.81465 5.94668 2.5511 11 2.04938Z")
  )
}
