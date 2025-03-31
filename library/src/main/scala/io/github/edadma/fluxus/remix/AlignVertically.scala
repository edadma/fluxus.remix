/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * AlignVertically icon from the Remix Icon library, Editor category.
 */
case class AlignVerticallyProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * AlignVertically icon component.
 *
 * @example AlignVertically <> AlignVerticallyProps(size = 24, color = "blue")
 */
def AlignVertically = (props: AlignVerticallyProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 11H21V13H3V11ZM18 18V21H16V18H13L17 14L21 18H18ZM8 18V21H6V18H3L7 14L11 18H8ZM18 6H21L17 10L13 6H16V3H18V6ZM8 6H11L7 10L3 6H6V3H8V6Z")
  )
}
