/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowTurnBackFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowTurnBackFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowTurnBackFill icon component.
 *
 * @example ArrowTurnBackFill <> ArrowTurnBackFillProps(size = 24, color = "blue")
 */
def ArrowTurnBackFill = (props: ArrowTurnBackFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 16H13L18 22L23 16H19V11C19 6.58172 15.4183 3 11 3C6.58172 3 3 6.58172 3 11V20H5V11C5 7.68629 7.68629 5 11 5C14.3137 5 17 7.68629 17 11V16Z")
  )
}
