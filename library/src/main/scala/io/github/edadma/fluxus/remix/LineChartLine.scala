/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * LineChartLine icon from the Remix Icon library, Business category.
 */
case class LineChartLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * LineChartLine icon component.
 *
 * @example LineChartLine <> LineChartLineProps(size = 24, color = "blue")
 */
def LineChartLine = (props: LineChartLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5 3V19H21V21H3V3H5ZM20.2929 6.29289L21.7071 7.70711L16 13.4142L13 10.415L8.70711 14.7071L7.29289 13.2929L13 7.58579L16 10.585L20.2929 6.29289Z")
  )
}
