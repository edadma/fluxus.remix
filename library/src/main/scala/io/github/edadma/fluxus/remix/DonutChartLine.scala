/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DonutChartLine icon from the Remix Icon library, Business category.
 */
case class DonutChartLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DonutChartLine icon component.
 *
 * @example DonutChartLine <> DonutChartLineProps(size = 24, color = "blue")
 */
def DonutChartLine = (props: DonutChartLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10.9999 2.04938L11 4.06188C7.05371 4.55396 4 7.92036 4 12C4 16.4183 7.58172 20 12 20C13.8487 20 15.5509 19.3729 16.9055 18.3199L18.3289 19.7428C16.605 21.1536 14.4014 22 12 22C6.47715 22 2 17.5228 2 12C2 6.81468 5.94662 2.55115 10.9999 2.04938ZM21.9506 13.0001C21.7509 15.0111 20.9555 16.8468 19.7433 18.3283L18.3199 16.9055C19.1801 15.799 19.756 14.4606 19.9381 12.9999L21.9506 13.0001ZM13.0011 2.04948C17.725 2.51902 21.4815 6.27589 21.9506 10.9999L19.9381 11C19.4869 7.38162 16.6192 4.51364 13.001 4.062L13.0011 2.04948Z")
  )
}
