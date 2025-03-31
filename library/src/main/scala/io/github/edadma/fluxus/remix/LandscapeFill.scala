/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * LandscapeFill icon from the Remix Icon library, Media category.
 */
case class LandscapeFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * LandscapeFill icon component.
 *
 * @example LandscapeFill <> LandscapeFillProps(size = 24, color = "blue")
 */
def LandscapeFill = (props: LandscapeFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 21L11.2381 12.2698L15 6L23 21H16ZM8 10L14 21H2L8 10ZM5.5 8C4.11929 8 3 6.88071 3 5.5C3 4.11929 4.11929 3 5.5 3C6.88071 3 8 4.11929 8 5.5C8 6.88071 6.88071 8 5.5 8Z")
  )
}
