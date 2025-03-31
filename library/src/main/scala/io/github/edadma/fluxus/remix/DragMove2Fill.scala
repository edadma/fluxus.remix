/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DragMove2Fill icon from the Remix Icon library, Arrows category.
 */
case class DragMove2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DragMove2Fill icon component.
 *
 * @example DragMove2Fill <> DragMove2FillProps(size = 24, color = "blue")
 */
def DragMove2Fill = (props: DragMove2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18 11V8L22 12L18 16V13H13V18H16L12 22L8 18H11V13H6V16L2 12L6 8V11H11V6H8L12 2L16 6H13V11H18Z")
  )
}
