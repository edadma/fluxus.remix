/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Layout3Fill icon from the Remix Icon library, Design category.
 */
case class Layout3FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Layout3Fill icon component.
 *
 * @example Layout3Fill <> Layout3FillProps(size = 24, color = "blue")
 */
def Layout3Fill = (props: Layout3FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8 10V21H4C3.44772 21 3 20.5523 3 20V10H8ZM21 10V20C21 20.5523 20.5523 21 20 21H10V10H21ZM20 3C20.5523 3 21 3.44772 21 4V8H3V4C3 3.44772 3.44772 3 4 3H20Z")
  )
}
