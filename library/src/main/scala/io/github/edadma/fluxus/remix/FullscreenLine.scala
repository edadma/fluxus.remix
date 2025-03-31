/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FullscreenLine icon from the Remix Icon library, Media category.
 */
case class FullscreenLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FullscreenLine icon component.
 *
 * @example FullscreenLine <> FullscreenLineProps(size = 24, color = "blue")
 */
def FullscreenLine = (props: FullscreenLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8 3V5H4V9H2V3H8ZM2 21V15H4V19H8V21H2ZM22 21H16V19H20V15H22V21ZM22 9H20V5H16V3H22V9Z")
  )
}
