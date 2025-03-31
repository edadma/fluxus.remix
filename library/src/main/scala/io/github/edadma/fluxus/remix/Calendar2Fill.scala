/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Calendar2Fill icon from the Remix Icon library, Business category.
 */
case class Calendar2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Calendar2Fill icon component.
 *
 * @example Calendar2Fill <> Calendar2FillProps(size = 24, color = "blue")
 */
def Calendar2Fill = (props: Calendar2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 3H21C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H7V1H9V3H15V1H17V3ZM4 9V19H20V9H4ZM6 11H8V13H6V11ZM11 11H13V13H11V11ZM16 11H18V13H16V11Z")
  )
}
