/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ReservedLine icon from the Remix Icon library, Others category.
 */
case class ReservedLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ReservedLine icon component.
 *
 * @example ReservedLine <> ReservedLineProps(size = 24, color = "blue")
 */
def ReservedLine = (props: ReservedLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 15V19H16V21H8V19H11V15H4C3.44772 15 3 14.5523 3 14V4C3 3.44772 3.44772 3 4 3H20C20.5523 3 21 3.44772 21 4V14C21 14.5523 20.5523 15 20 15H13ZM5 13H19V5H5V13ZM8 8H16V10H8V8Z")
  )
}
