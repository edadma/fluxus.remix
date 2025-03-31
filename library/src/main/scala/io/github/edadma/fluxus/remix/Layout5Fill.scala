/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Layout5Fill icon from the Remix Icon library, Design category.
 */
case class Layout5FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Layout5Fill icon component.
 *
 * @example Layout5Fill <> Layout5FillProps(size = 24, color = "blue")
 */
def Layout5Fill = (props: Layout5FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 10V21H3C2.44772 21 2 20.5523 2 20V10H7ZM22 10V20C22 20.5523 21.5523 21 21 21H9V10H22ZM21 3C21.5523 3 22 3.44772 22 4V8H2V4C2 3.44772 2.44772 3 3 3H21Z")
  )
}
