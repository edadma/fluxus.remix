/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Drinks2Fill icon from the Remix Icon library, Food category.
 */
case class Drinks2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Drinks2Fill icon component.
 *
 * @example Drinks2Fill <> Drinks2FillProps(size = 24, color = "blue")
 */
def Drinks2Fill = (props: Drinks2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7.32297 2H4V0H8.67703L10.677 5H21V7H18.8824L18.0554 21.0587C18.0243 21.5873 17.5866 22 17.0571 22H6.9429C6.41343 22 5.97572 21.5873 5.94463 21.0587L5.11765 7H3V5H8.52297L7.32297 2ZM7.1211 7L7.29906 10.0252C9.97062 10.1354 11.2679 10.6301 12.36 11.067C13.4113 11.4875 14.28 11.8532 16.5867 11.9676L16.8789 7H7.1211Z")
  )
}
