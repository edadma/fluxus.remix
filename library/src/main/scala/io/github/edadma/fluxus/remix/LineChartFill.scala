/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * LineChartFill icon from the Remix Icon library, Business category.
 */
case class LineChartFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * LineChartFill icon component.
 *
 * @example LineChartFill <> LineChartFillProps(size = 24, color = "blue")
 */
def LineChartFill = (props: LineChartFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5 3V19H21V21H3V3H5ZM19.9393 5.93934L22.0607 8.06066L16 14.1213L13 11.121L9.06066 15.0607L6.93934 12.9393L13 6.87868L16 9.879L19.9393 5.93934Z")
  )
}
