/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SortDesc icon from the Remix Icon library, Editor category.
 */
case class SortDescProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SortDesc icon component.
 *
 * @example SortDesc <> SortDescProps(size = 24, color = "blue")
 */
def SortDesc = (props: SortDescProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 4V16H23L19 21L15 16H18V4H20ZM12 18V20H3V18H12ZM14 11V13H3V11H14ZM14 4V6H3V4H14Z")
  )
}
