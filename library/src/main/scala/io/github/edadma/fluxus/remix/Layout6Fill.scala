/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Layout6Fill icon from the Remix Icon library, Design category.
 */
case class Layout6FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Layout6Fill icon component.
 *
 * @example Layout6Fill <> Layout6FillProps(size = 24, color = "blue")
 */
def Layout6Fill = (props: Layout6FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15 10V21H3C2.44772 21 2 20.5523 2 20V10H15ZM22 10V20C22 20.5523 21.5523 21 21 21H17V10H22ZM21 3C21.5523 3 22 3.44772 22 4V8H2V4C2 3.44772 2.44772 3 3 3H21Z")
  )
}
