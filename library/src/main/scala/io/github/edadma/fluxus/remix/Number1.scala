/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Number1 icon from the Remix Icon library, Editor category.
 */
case class Number1Props(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Number1 icon component.
 *
 * @example Number1 <> Number1Props(size = 24, color = "blue")
 */
def Number1 = (props: Number1Props) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14 1.5V22H12V3.704L7.5 4.91V2.839L12.5 1.5H14Z")
  )
}
