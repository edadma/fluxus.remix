/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerLeftDownFill icon from the Remix Icon library, Arrows category.
 */
case class CornerLeftDownFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerLeftDownFill icon component.
 *
 * @example CornerLeftDownFill <> CornerLeftDownFillProps(size = 24, color = "blue")
 */
def CornerLeftDownFill = (props: CornerLeftDownFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10.0001 4.99989L19 4.99976L19 6.99976L12.0001 6.99986L12 14.5859H17.4142L11 21.0001L4.58578 14.5859L10 14.5859L10.0001 4.99989Z")
  )
}
