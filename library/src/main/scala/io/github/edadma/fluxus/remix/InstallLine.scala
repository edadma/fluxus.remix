/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * InstallLine icon from the Remix Icon library, Device category.
 */
case class InstallLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * InstallLine icon component.
 *
 * @example InstallLine <> InstallLineProps(size = 24, color = "blue")
 */
def InstallLine = (props: InstallLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9 2V4H5L4.999 14H18.999L19 4H15V2H20C20.5523 2 21 2.44772 21 3V21C21 21.5523 20.5523 22 20 22H4C3.44772 22 3 21.5523 3 21V3C3 2.44772 3.44772 2 4 2H9ZM18.999 16H4.999L5 20H19L18.999 16ZM17 17V19H15V17H17ZM13 2V7H16L12 11L8 7H11V2H13Z")
  )
}
