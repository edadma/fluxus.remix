/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BarChart2Line icon from the Remix Icon library, Business category.
 */
case class BarChart2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BarChart2Line icon component.
 *
 * @example BarChart2Line <> BarChart2LineProps(size = 24, color = "blue")
 */
def BarChart2Line = (props: BarChart2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 13H8V21H2V13ZM16 8H22V21H16V8ZM9 3H15V21H9V3ZM4 15V19H6V15H4ZM11 5V19H13V5H11ZM18 10V19H20V10H18Z")
  )
}
