/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SkipForwardMiniLine icon from the Remix Icon library, Media category.
 */
case class SkipForwardMiniLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SkipForwardMiniLine icon component.
 *
 * @example SkipForwardMiniLine <> SkipForwardMiniLineProps(size = 24, color = "blue")
 */
def SkipForwardMiniLine = (props: SkipForwardMiniLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.0319 12L9 9.85984V14.1402L12.0319 12ZM7.5 17.535C7.22386 17.535 7 17.3112 7 17.035V6.96496C7 6.8617 7.03197 6.76098 7.09152 6.67662C7.25076 6.45102 7.56274 6.39723 7.78834 6.55648L14.9213 11.5915C14.9679 11.6244 15.0086 11.665 15.0415 11.7117C15.2007 11.9373 15.1469 12.2492 14.9213 12.4085L7.78834 17.4435C7.70398 17.5031 7.60326 17.535 7.5 17.535ZM16 7C16 6.44772 16.4477 6 17 6C17.5523 6 18 6.44772 18 7V17C18 17.5523 17.5523 18 17 18C16.4477 18 16 17.5523 16 17V7Z")
  )
}
