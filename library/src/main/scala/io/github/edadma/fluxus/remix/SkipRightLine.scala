/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SkipRightLine icon from the Remix Icon library, Arrows category.
 */
case class SkipRightLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SkipRightLine icon component.
 *
 * @example SkipRightLine <> SkipRightLineProps(size = 24, color = "blue")
 */
def SkipRightLine = (props: SkipRightLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10.0858 12L5.29289 16.7929L6.70711 18.2071L12.9142 12L6.70711 5.79291L5.29289 7.20712L10.0858 12ZM17 6.00002L17 18H15L15 6.00002L17 6.00002Z")
  )
}
