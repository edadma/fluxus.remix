/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SlideshowLine icon from the Remix Icon library, Business category.
 */
case class SlideshowLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SlideshowLine icon component.
 *
 * @example SlideshowLine <> SlideshowLineProps(size = 24, color = "blue")
 */
def SlideshowLine = (props: SlideshowLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 21V23H11V21H3C2.44772 21 2 20.5523 2 20V6H22V20C22 20.5523 21.5523 21 21 21H13ZM4 19H20V8H4V19ZM13 10H18V12H13V10ZM13 14H18V16H13V14ZM9 10V13H12C12 14.6569 10.6569 16 9 16C7.34315 16 6 14.6569 6 13C6 11.3431 7.34315 10 9 10ZM2 3H22V5H2V3Z")
  )
}
