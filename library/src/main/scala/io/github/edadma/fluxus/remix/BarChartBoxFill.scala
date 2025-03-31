/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BarChartBoxFill icon from the Remix Icon library, Business category.
 */
case class BarChartBoxFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BarChartBoxFill icon component.
 *
 * @example BarChartBoxFill <> BarChartBoxFillProps(size = 24, color = "blue")
 */
def BarChartBoxFill = (props: BarChartBoxFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 3H21C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3ZM7 13V17H9V13H7ZM11 7V17H13V7H11ZM15 10V17H17V10H15Z")
  )
}
