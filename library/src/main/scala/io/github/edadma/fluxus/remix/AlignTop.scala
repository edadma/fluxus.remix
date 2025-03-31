/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * AlignTop icon from the Remix Icon library, Editor category.
 */
case class AlignTopProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * AlignTop icon component.
 *
 * @example AlignTop <> AlignTopProps(size = 24, color = "blue")
 */
def AlignTop = (props: AlignTopProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 3H21V5H3V3ZM8 11V21H6V11H3L7 7L11 11H8ZM18 11V21H16V11H13L17 7L21 11H18Z")
  )
}
