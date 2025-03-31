/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ServerFill icon from the Remix Icon library, Device category.
 */
case class ServerFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ServerFill icon component.
 *
 * @example ServerFill <> ServerFillProps(size = 24, color = "blue")
 */
def ServerFill = (props: ServerFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 3H20C20.5523 3 21 3.44772 21 4V11H3V4C3 3.44772 3.44772 3 4 3ZM3 13H21V20C21 20.5523 20.5523 21 20 21H4C3.44772 21 3 20.5523 3 20V13ZM7 16V18H10V16H7ZM7 6V8H10V6H7Z")
  )
}
