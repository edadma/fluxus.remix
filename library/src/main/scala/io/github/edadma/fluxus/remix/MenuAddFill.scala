/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MenuAddFill icon from the Remix Icon library, System category.
 */
case class MenuAddFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MenuAddFill icon component.
 *
 * @example MenuAddFill <> MenuAddFillProps(size = 24, color = "blue")
 */
def MenuAddFill = (props: MenuAddFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18 15L17.999 18H21V20H17.999L18 23H16L15.999 20H13V18H15.999L16 15H18ZM11 18V20H3V18H11ZM21 11V13H3V11H21ZM21 4V6H3V4H21Z")
  )
}
