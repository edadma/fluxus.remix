/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowGoBackFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowGoBackFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowGoBackFill icon component.
 *
 * @example ArrowGoBackFill <> ArrowGoBackFillProps(size = 24, color = "blue")
 */
def ArrowGoBackFill = (props: ArrowGoBackFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8 7V11L2 6L8 1V5H13C17.4183 5 21 8.58172 21 13C21 17.4183 17.4183 21 13 21H4V19H13C16.3137 19 19 16.3137 19 13C19 9.68629 16.3137 7 13 7H8Z")
  )
}
