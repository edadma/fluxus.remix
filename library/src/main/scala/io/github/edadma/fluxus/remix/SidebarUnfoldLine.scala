/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SidebarUnfoldLine icon from the Remix Icon library, System category.
 */
case class SidebarUnfoldLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SidebarUnfoldLine icon component.
 *
 * @example SidebarUnfoldLine <> SidebarUnfoldLineProps(size = 24, color = "blue")
 */
def SidebarUnfoldLine = (props: SidebarUnfoldLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5 5H13V19H5V5ZM19 19H15V5H19V19ZM4 3C3.44772 3 3 3.44772 3 4V20C3 20.5523 3.44772 21 4 21H20C20.5523 21 21 20.5523 21 20V4C21 3.44772 20.5523 3 20 3H4ZM11 12L7 8.5V15.5L11 12Z")
  )
}
