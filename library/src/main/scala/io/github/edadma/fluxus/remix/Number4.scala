/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Number4 icon from the Remix Icon library, Editor category.
 */
case class Number4Props(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Number4 icon component.
 *
 * @example Number4 <> Number4Props(size = 24, color = "blue")
 */
def Number4 = (props: Number4Props) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16.0001 1.5L16 16H19.0001V18H16L16.0001 22H14.0001L14 18H4V16.898L14.0001 1.5H16.0001ZM14 16V5.171L6.968 16H14Z")
  )
}
