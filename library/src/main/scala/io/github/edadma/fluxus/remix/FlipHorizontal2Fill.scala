/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FlipHorizontal2Fill icon from the Remix Icon library, Design category.
 */
case class FlipHorizontal2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FlipHorizontal2Fill icon component.
 *
 * @example FlipHorizontal2Fill <> FlipHorizontal2FillProps(size = 24, color = "blue")
 */
def FlipHorizontal2Fill = (props: FlipHorizontal2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 3C3.44772 3 3 3.44772 3 4V20C3 20.5523 3.44772 21 4 21H20C20.5523 21 21 20.5523 21 20V4C21 3.44772 20.5523 3 20 3H4ZM10 8V11H14V8L18 12L14 16V13H10V16L6 12L10 8Z")
  )
}
