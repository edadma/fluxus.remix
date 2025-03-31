/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Text icon from the Remix Icon library, Editor category.
 */
case class TextProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Text icon component.
 *
 * @example Text <> TextProps(size = 24, color = "blue")
 */
def Text = (props: TextProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 6V21H11V6H5V4H19V6H13Z")
  )
}
