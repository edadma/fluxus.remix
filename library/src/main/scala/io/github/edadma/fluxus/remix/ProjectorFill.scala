/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ProjectorFill icon from the Remix Icon library, Business category.
 */
case class ProjectorFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ProjectorFill icon component.
 *
 * @example ProjectorFill <> ProjectorFillProps(size = 24, color = "blue")
 */
def ProjectorFill = (props: ProjectorFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 3H21C21.5523 3 22 3.44772 22 4V10H18.874C18.4299 8.27477 16.8638 7 15 7C13.1362 7 11.5701 8.27477 11.126 10H2V4C2 3.44772 2.44772 3 3 3ZM2 12V20C2 20.5523 2.44772 21 3 21H21C21.5523 21 22 20.5523 22 20V12H18.874C18.4299 13.7252 16.8638 15 15 15C13.1362 15 11.5701 13.7252 11.126 12H2ZM15 9C13.8954 9 13 9.89543 13 11C13 12.1046 13.8954 13 15 13C16.1046 13 17 12.1046 17 11C17 9.89543 16.1046 9 15 9ZM6 15H8V17H6V15Z")
  )
}
