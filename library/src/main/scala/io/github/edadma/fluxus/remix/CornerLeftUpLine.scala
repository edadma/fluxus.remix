/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerLeftUpLine icon from the Remix Icon library, Arrows category.
 */
case class CornerLeftUpLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerLeftUpLine icon component.
 *
 * @example CornerLeftUpLine <> CornerLeftUpLineProps(size = 24, color = "blue")
 */
def CornerLeftUpLine = (props: CornerLeftUpLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10.0001 19.0001L19 19.0002L19 17.0002L12.0001 17.0001L12 6.8283L15.9497 10.778L17.364 9.36381L11 2.99985L4.63603 9.36381L6.05025 10.778L10 6.82825L10.0001 19.0001Z")
  )
}
