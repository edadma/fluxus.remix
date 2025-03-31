/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * GridFill icon from the Remix Icon library, Design category.
 */
case class GridFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * GridFill icon component.
 *
 * @example GridFill <> GridFillProps(size = 24, color = "blue")
 */
def GridFill = (props: GridFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14 10V14H10V10H14ZM16 10H21V14H16V10ZM14 21H10V16H14V21ZM16 21V16H21V20C21 20.5523 20.5523 21 20 21H16ZM14 3V8H10V3H14ZM16 3H20C20.5523 3 21 3.44772 21 4V8H16V3ZM8 10V14H3V10H8ZM8 21H4C3.44772 21 3 20.5523 3 20V16H8V21ZM8 3V8H3V4C3 3.44772 3.44772 3 4 3H8Z")
  )
}
