/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerLeftUpFill icon from the Remix Icon library, Arrows category.
 */
case class CornerLeftUpFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerLeftUpFill icon component.
 *
 * @example CornerLeftUpFill <> CornerLeftUpFillProps(size = 24, color = "blue")
 */
def CornerLeftUpFill = (props: CornerLeftUpFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10.0001 19.0001L19 19.0003L19 17.0003L12.0001 17.0002L12 9.41409H17.4142L11 2.99988L4.58578 9.41409L10 9.41409L10.0001 19.0001Z")
  )
}
