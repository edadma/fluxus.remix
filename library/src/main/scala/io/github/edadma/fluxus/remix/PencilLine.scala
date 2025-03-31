/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PencilLine icon from the Remix Icon library, Design category.
 */
case class PencilLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PencilLine icon component.
 *
 * @example PencilLine <> PencilLineProps(size = 24, color = "blue")
 */
def PencilLine = (props: PencilLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.7279 9.57627L14.3137 8.16206L5 17.4758V18.89H6.41421L15.7279 9.57627ZM17.1421 8.16206L18.5563 6.74785L17.1421 5.33363L15.7279 6.74785L17.1421 8.16206ZM7.24264 20.89H3V16.6473L16.435 3.21231C16.8256 2.82179 17.4587 2.82179 17.8492 3.21231L20.6777 6.04074C21.0682 6.43126 21.0682 7.06443 20.6777 7.45495L7.24264 20.89Z")
  )
}
