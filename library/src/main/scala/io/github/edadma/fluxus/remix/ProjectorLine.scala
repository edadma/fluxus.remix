/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ProjectorLine icon from the Remix Icon library, Business category.
 */
case class ProjectorLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ProjectorLine icon component.
 *
 * @example ProjectorLine <> ProjectorLineProps(size = 24, color = "blue")
 */
def ProjectorLine = (props: ProjectorLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 3H21C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3ZM11.126 12H4V19H20V12H18.874C18.4299 13.7252 16.8638 15 15 15C13.1362 15 11.5701 13.7252 11.126 12ZM11.126 10C11.5701 8.27477 13.1362 7 15 7C16.8638 7 18.4299 8.27477 18.874 10H20V5H4V10H11.126ZM15 13C16.1046 13 17 12.1046 17 11C17 9.89543 16.1046 9 15 9C13.8954 9 13 9.89543 13 11C13 12.1046 13.8954 13 15 13ZM6 15H8V17H6V15Z")
  )
}
