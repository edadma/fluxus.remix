/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Bus2Fill icon from the Remix Icon library, Map category.
 */
case class Bus2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Bus2Fill icon component.
 *
 * @example Bus2Fill <> Bus2FillProps(size = 24, color = "blue")
 */
def Bus2Fill = (props: Bus2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 20H7V21C7 21.5523 6.55228 22 6 22H4C3.44772 22 3 21.5523 3 21V12H2V8H3V5C3 3.89543 3.89543 3 5 3H19C20.1046 3 21 3.89543 21 5V8H22V12H21V21C21 21.5523 20.5523 22 20 22H18C17.4477 22 17 21.5523 17 21V20ZM5 5V12H19V5H5ZM7.5 18C8.32843 18 9 17.3284 9 16.5C9 15.6716 8.32843 15 7.5 15C6.67157 15 6 15.6716 6 16.5C6 17.3284 6.67157 18 7.5 18ZM16.5 18C17.3284 18 18 17.3284 18 16.5C18 15.6716 17.3284 15 16.5 15C15.6716 15 15 15.6716 15 16.5C15 17.3284 15.6716 18 16.5 18Z")
  )
}
