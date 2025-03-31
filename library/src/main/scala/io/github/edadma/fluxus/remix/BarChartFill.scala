/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BarChartFill icon from the Remix Icon library, Business category.
 */
case class BarChartFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BarChartFill icon component.
 *
 * @example BarChartFill <> BarChartFillProps(size = 24, color = "blue")
 */
def BarChartFill = (props: BarChartFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 12H7V21H3V12ZM17 8H21V21H17V8ZM10 2H14V21H10V2Z")
  )
}
