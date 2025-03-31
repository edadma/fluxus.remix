/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowRightDownLongFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowRightDownLongFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowRightDownLongFill icon component.
 *
 * @example ArrowRightDownLongFill <> ArrowRightDownLongFillProps(size = 24, color = "blue")
 */
def ArrowRightDownLongFill = (props: ArrowRightDownLongFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5.63578 4.22174L4.22157 5.63575L13.8284 15.2427L10 19.0711L19.0711 19.0711L19.0711 10L15.2426 13.8285L5.63578 4.22174Z")
  )
}
