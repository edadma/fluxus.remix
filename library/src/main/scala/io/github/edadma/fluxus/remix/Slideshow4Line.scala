/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Slideshow4Line icon from the Remix Icon library, Business category.
 */
case class Slideshow4LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Slideshow4Line icon component.
 *
 * @example Slideshow4Line <> Slideshow4LineProps(size = 24, color = "blue")
 */
def Slideshow4Line = (props: Slideshow4LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8.17071 3C8.58254 1.83481 9.69378 1 11 1H13C14.3062 1 15.4175 1.83481 15.8293 3H21C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H8.17071ZM4 5V19H20V5H15.8293C15.4175 6.16519 14.3062 7 13 7H11C9.69378 7 8.58254 6.16519 8.17071 5H4ZM11 3C10.4477 3 10 3.44772 10 4C10 4.55228 10.4477 5 11 5H13C13.5523 5 14 4.55228 14 4C14 3.44772 13.5523 3 13 3H11ZM10 9L15 12L10 15V9Z")
  )
}
