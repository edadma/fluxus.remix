/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Shining2Fill icon from the Remix Icon library, Weather category.
 */
case class Shining2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Shining2Fill icon component.
 *
 * @example Shining2Fill <> Shining2FillProps(size = 24, color = "blue")
 */
def Shining2Fill = (props: Shining2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 0.5L16 8L23.5 12L16 16L12 23.5L8 16L0.5 12L8 8L12 0.5Z")
  )
}
