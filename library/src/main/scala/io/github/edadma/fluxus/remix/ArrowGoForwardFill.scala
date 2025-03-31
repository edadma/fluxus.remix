/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowGoForwardFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowGoForwardFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowGoForwardFill icon component.
 *
 * @example ArrowGoForwardFill <> ArrowGoForwardFillProps(size = 24, color = "blue")
 */
def ArrowGoForwardFill = (props: ArrowGoForwardFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 7H11C7.68629 7 5 9.68629 5 13C5 16.3137 7.68629 19 11 19H20V21H11C6.58172 21 3 17.4183 3 13C3 8.58172 6.58172 5 11 5H16V1L22 6L16 11V7Z")
  )
}
