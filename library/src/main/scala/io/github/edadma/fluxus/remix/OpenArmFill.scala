/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * OpenArmFill icon from the Remix Icon library, User & Faces category.
 */
case class OpenArmFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * OpenArmFill icon component.
 *
 * @example OpenArmFill <> OpenArmFillProps(size = 24, color = "blue")
 */
def OpenArmFill = (props: OpenArmFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.0004 12C9.23902 12 7.00045 9.76142 7.00045 7C7.00045 4.23858 9.23902 2 12.0004 2C14.7619 2 17.0004 4.23858 17.0004 7C17.0004 9.76142 14.7619 12 12.0004 12ZM18.0004 17V22H16.0004V17C16.0004 12.5487 18.6444 8.71498 22.4475 6.98352L23.2753 8.8047C20.1637 10.2213 18.0004 13.3581 18.0004 17ZM8.00045 17V22H6.00045V17C6.00045 13.3581 3.83723 10.2213 0.725586 8.8047L1.55339 6.98352C5.35651 8.71498 8.00045 12.5487 8.00045 17Z")
  )
}
