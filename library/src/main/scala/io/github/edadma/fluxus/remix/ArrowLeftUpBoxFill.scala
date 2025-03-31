/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftUpBoxFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftUpBoxFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftUpBoxFill icon component.
 *
 * @example ArrowLeftUpBoxFill <> ArrowLeftUpBoxFillProps(size = 24, color = "blue")
 */
def ArrowLeftUpBoxFill = (props: ArrowLeftUpBoxFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 3C3.44772 3 3 3.44772 3 4V20C3 20.5523 3.44772 21 4 21H20C20.5523 21 21 20.5523 21 20V4C21 3.44772 20.5523 3 20 3H4ZM8 8H16.4142L12.9142 11.5L16.7071 15.2929L15.2929 16.7071L11.5 12.9142L8 16.4142V8Z")
  )
}
