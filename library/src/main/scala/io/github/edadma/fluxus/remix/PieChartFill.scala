/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PieChartFill icon from the Remix Icon library, Business category.
 */
case class PieChartFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PieChartFill icon component.
 *
 * @example PieChartFill <> PieChartFillProps(size = 24, color = "blue")
 */
def PieChartFill = (props: PieChartFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 2.04938V13H21.9506C21.4489 18.0533 17.1853 22 12 22C6.47715 22 2 17.5229 2 12C2 6.81465 5.94668 2.5511 11 2.04938ZM13 2.04938C17.7244 2.51845 21.4816 6.27559 21.9506 11H13V2.04938Z")
  )
}
