/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BarChartHorizontalFill icon from the Remix Icon library, Business category.
 */
case class BarChartHorizontalFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BarChartHorizontalFill icon component.
 *
 * @example BarChartHorizontalFill <> BarChartHorizontalFillProps(size = 24, color = "blue")
 */
def BarChartHorizontalFill = (props: BarChartHorizontalFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 3V7H3V3H12ZM16 17V21H3V17H16ZM22 10V14H3V10H22Z")
  )
}
