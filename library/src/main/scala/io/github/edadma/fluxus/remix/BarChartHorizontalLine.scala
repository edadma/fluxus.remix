/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BarChartHorizontalLine icon from the Remix Icon library, Business category.
 */
case class BarChartHorizontalLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BarChartHorizontalLine icon component.
 *
 * @example BarChartHorizontalLine <> BarChartHorizontalLineProps(size = 24, color = "blue")
 */
def BarChartHorizontalLine = (props: BarChartHorizontalLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 3V5H3V3H12ZM16 19V21H3V19H16ZM22 11V13H3V11H22Z")
  )
}
