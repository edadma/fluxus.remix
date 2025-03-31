/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FullscreenFill icon from the Remix Icon library, Media category.
 */
case class FullscreenFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FullscreenFill icon component.
 *
 * @example FullscreenFill <> FullscreenFillProps(size = 24, color = "blue")
 */
def FullscreenFill = (props: FullscreenFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 3H22V9H20V5H16V3ZM2 3H8V5H4V9H2V3ZM20 19V15H22V21H16V19H20ZM4 19H8V21H2V15H4V19Z")
  )
}
