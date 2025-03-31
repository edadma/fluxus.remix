/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * AlignBottom icon from the Remix Icon library, Editor category.
 */
case class AlignBottomProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * AlignBottom icon component.
 *
 * @example AlignBottom <> AlignBottomProps(size = 24, color = "blue")
 */
def AlignBottom = (props: AlignBottomProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 19H21V21H3V19ZM8 13H11L7 17L3 13H6V3H8V13ZM18 13H21L17 17L13 13H16V3H18V13Z")
  )
}
