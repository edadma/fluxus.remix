/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SlideshowFill icon from the Remix Icon library, Business category.
 */
case class SlideshowFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SlideshowFill icon component.
 *
 * @example SlideshowFill <> SlideshowFillProps(size = 24, color = "blue")
 */
def SlideshowFill = (props: SlideshowFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 21V23H11V21H3C2.44772 21 2 20.5523 2 20V6H22V20C22 20.5523 21.5523 21 21 21H13ZM8 10C6.34315 10 5 11.3431 5 13C5 14.6569 6.34315 16 8 16C9.65685 16 11 14.6569 11 13H8V10ZM13 10V12H19V10H13ZM13 14V16H19V14H13ZM2 3H22V5H2V3Z")
  )
}
