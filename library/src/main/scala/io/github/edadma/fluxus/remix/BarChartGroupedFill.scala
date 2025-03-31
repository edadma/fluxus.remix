/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BarChartGroupedFill icon from the Remix Icon library, Business category.
 */
case class BarChartGroupedFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BarChartGroupedFill icon component.
 *
 * @example BarChartGroupedFill <> BarChartGroupedFillProps(size = 24, color = "blue")
 */
def BarChartGroupedFill = (props: BarChartGroupedFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 12H4V21H2V12ZM5 14H7V21H5V14ZM16 8H18V21H16V8ZM19 10H21V21H19V10ZM9 2H11V21H9V2ZM12 4H14V21H12V4Z")
  )
}
