/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandHorizontalFill icon from the Remix Icon library, Arrows category.
 */
case class ExpandHorizontalFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandHorizontalFill icon component.
 *
 * @example ExpandHorizontalFill <> ExpandHorizontalFillProps(size = 24, color = "blue")
 */
def ExpandHorizontalFill = (props: ExpandHorizontalFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M0.5 12L5.44975 7.05029L5.44876 11H10V13H5.44826L5.44727 16.9473L0.5 12ZM14 13H18.5501L18.55 16.9493L23.5 11.9996L18.5503 7.0498L18.5502 11H14V13Z")
  )
}
