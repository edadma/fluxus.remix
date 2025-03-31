/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandWidthFill icon from the Remix Icon library, Arrows category.
 */
case class ExpandWidthFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandWidthFill icon component.
 *
 * @example ExpandWidthFill <> ExpandWidthFillProps(size = 24, color = "blue")
 */
def ExpandWidthFill = (props: ExpandWidthFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 6L2 18H4L4 6H2ZM9.44975 7.05025L4.5 12L9.44727 16.9473L9.44826 13H14.5501L14.55 16.9492L19.5 11.9995L14.5503 7.04976L14.5502 11H9.44876L9.44975 7.05025ZM20 6H22V18H20V6Z")
  )
}
