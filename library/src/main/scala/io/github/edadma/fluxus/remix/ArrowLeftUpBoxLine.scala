/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftUpBoxLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftUpBoxLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftUpBoxLine icon component.
 *
 * @example ArrowLeftUpBoxLine <> ArrowLeftUpBoxLineProps(size = 24, color = "blue")
 */
def ArrowLeftUpBoxLine = (props: ArrowLeftUpBoxLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 3H4C3.44772 3 3 3.44772 3 4V20C3 20.5523 3.44772 21 4 21H20C20.5523 21 21 20.5523 21 20V4C21 3.44772 20.5523 3 20 3ZM5 19V5H19V19H5ZM8 8V16H10V11.4142L15.2929 16.7071L16.7071 15.2929L11.4142 10H16V8H8Z")
  )
}
