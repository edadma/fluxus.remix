/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Bus2Line icon from the Remix Icon library, Map category.
 */
case class Bus2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Bus2Line icon component.
 *
 * @example Bus2Line <> Bus2LineProps(size = 24, color = "blue")
 */
def Bus2Line = (props: Bus2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 20H7V21C7 21.5523 6.55228 22 6 22H4C3.44772 22 3 21.5523 3 21V12H2V8H3V5C3 3.89543 3.89543 3 5 3H19C20.1046 3 21 3.89543 21 5V8H22V12H21V21C21 21.5523 20.5523 22 20 22H18C17.4477 22 17 21.5523 17 21V20ZM5 5V11H19V5H5ZM19 13H5V18H19V13ZM7.5 17C6.67157 17 6 16.3284 6 15.5C6 14.6716 6.67157 14 7.5 14C8.32843 14 9 14.6716 9 15.5C9 16.3284 8.32843 17 7.5 17ZM16.5 17C15.6716 17 15 16.3284 15 15.5C15 14.6716 15.6716 14 16.5 14C17.3284 14 18 14.6716 18 15.5C18 16.3284 17.3284 17 16.5 17Z")
  )
}
