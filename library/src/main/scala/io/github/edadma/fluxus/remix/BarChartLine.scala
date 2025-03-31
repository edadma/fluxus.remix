/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BarChartLine icon from the Remix Icon library, Business category.
 */
case class BarChartLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BarChartLine icon component.
 *
 * @example BarChartLine <> BarChartLineProps(size = 24, color = "blue")
 */
def BarChartLine = (props: BarChartLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 12H5V21H3V12ZM19 8H21V21H19V8ZM11 2H13V21H11V2Z")
  )
}
