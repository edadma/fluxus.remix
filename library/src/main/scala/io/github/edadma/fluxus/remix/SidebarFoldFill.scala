/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SidebarFoldFill icon from the Remix Icon library, System category.
 */
case class SidebarFoldFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SidebarFoldFill icon component.
 *
 * @example SidebarFoldFill <> SidebarFoldFillProps(size = 24, color = "blue")
 */
def SidebarFoldFill = (props: SidebarFoldFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 3H4C3.44772 3 3 3.44772 3 4V20C3 20.5523 3.44772 21 4 21H13V3ZM15 21V3H20C20.5523 3 21 3.44772 21 4V20C21 20.5523 20.5523 21 20 21H15ZM11 8.5V15.5L7 12L11 8.5Z")
  )
}
