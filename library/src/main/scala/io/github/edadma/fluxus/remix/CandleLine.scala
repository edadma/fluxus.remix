/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CandleLine icon from the Remix Icon library, Others category.
 */
case class CandleLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CandleLine icon component.
 *
 * @example CandleLine <> CandleLineProps(size = 24, color = "blue")
 */
def CandleLine = (props: CandleLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9.17157 9.33147C7.60948 7.76938 7.60948 5.23672 9.17157 3.67462L12 0.846191L14.8284 3.67462C16.3905 5.23672 16.3905 7.76938 14.8284 9.33147C14.3039 9.85601 13.6699 10.2044 13 10.3767V12H18C18.5523 12 19 12.4477 19 13V20H21V22H3V20H5V13C5 12.4477 5.44772 12 6 12H11V10.3767C10.3301 10.2044 9.69611 9.85601 9.17157 9.33147ZM10.5858 5.08883C9.80474 5.86988 9.80474 7.13621 10.5858 7.91726C11.3668 8.69831 12.6332 8.69831 13.4142 7.91726C14.1953 7.13621 14.1953 5.86988 13.4142 5.08883L12 3.67462L10.5858 5.08883ZM7 14V20H17V14H7Z")
  )
}
