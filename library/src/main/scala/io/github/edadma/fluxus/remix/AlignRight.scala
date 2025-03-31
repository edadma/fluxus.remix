/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * AlignRight icon from the Remix Icon library, Editor category.
 */
case class AlignRightProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * AlignRight icon component.
 *
 * @example AlignRight <> AlignRightProps(size = 24, color = "blue")
 */
def AlignRight = (props: AlignRightProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 4H21V6H3V4ZM7 19H21V21H7V19ZM3 14H21V16H3V14ZM7 9H21V11H7V9Z")
  )
}
