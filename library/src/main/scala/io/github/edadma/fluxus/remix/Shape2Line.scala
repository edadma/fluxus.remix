/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Shape2Line icon from the Remix Icon library, Design category.
 */
case class Shape2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Shape2Line icon component.
 *
 * @example Shape2Line <> Shape2LineProps(size = 24, color = "blue")
 */
def Shape2Line = (props: Shape2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 16H22V22H16V20H8V22H2V16H4V8H2V2H8V4H16V2H22V8H20V16ZM18 16V8H16V6H8V8H6V16H8V18H16V16H18ZM4 4V6H6V4H4ZM4 18V20H6V18H4ZM18 4V6H20V4H18ZM18 18V20H20V18H18Z")
  )
}
