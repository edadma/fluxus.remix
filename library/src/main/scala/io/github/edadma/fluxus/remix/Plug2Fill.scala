/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Plug2Fill icon from the Remix Icon library, Others category.
 */
case class Plug2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Plug2Fill icon component.
 *
 * @example Plug2Fill <> Plug2FillProps(size = 24, color = "blue")
 */
def Plug2Fill = (props: Plug2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 18V20H19V22H13C11.8954 22 11 21.1046 11 20V18H8C5.79086 18 4 16.2091 4 14V10H20V14C20 16.2091 18.2091 18 16 18H13ZM17 6H19C19.5523 6 20 6.44772 20 7V9H4V7C4 6.44772 4.44772 6 5 6H7V2H9V6H15V2H17V6ZM12 14.5C12.5523 14.5 13 14.0523 13 13.5C13 12.9477 12.5523 12.5 12 12.5C11.4477 12.5 11 12.9477 11 13.5C11 14.0523 11.4477 14.5 12 14.5ZM11 2H13V5H11V2Z")
  )
}
