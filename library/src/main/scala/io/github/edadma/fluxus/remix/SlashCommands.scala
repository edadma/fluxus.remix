/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SlashCommands icon from the Remix Icon library, Editor category.
 */
case class SlashCommandsProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SlashCommands icon component.
 *
 * @example SlashCommands <> SlashCommandsProps(size = 24, color = "blue")
 */
def SlashCommands = (props: SlashCommandsProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 3H5V7H3V3ZM9.78839 21H7.66003L14.2115 3H16.3398L9.78839 21ZM21 3H19V7H21V3Z")
  )
}
