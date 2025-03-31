/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ChinaRailwayLine icon from the Remix Icon library, Map category.
 */
case class ChinaRailwayLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ChinaRailwayLine icon component.
 *
 * @example ChinaRailwayLine <> ChinaRailwayLineProps(size = 24, color = "blue")
 */
def ChinaRailwayLine = (props: ChinaRailwayLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 20V13H9V10H15V13H13V20H18V22H6V20H11ZM10 2.22302V1H14V2.22302C18.008 3.13247 21 6.71683 21 11C21 14.1235 19.4088 16.8754 16.9928 18.4892L15.8833 16.825C17.7624 15.5697 19 13.4294 19 11C19 7.13401 15.866 4 12 4C8.13401 4 5 7.13401 5 11C5 13.4294 6.23758 15.5697 8.11669 16.825L7.00717 18.4892C4.59118 16.8754 3 14.1235 3 11C3 6.71683 5.99202 3.13247 10 2.22302Z")
  )
}
