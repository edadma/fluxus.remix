/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FlickrFill icon from the Remix Icon library, Logos category.
 */
case class FlickrFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FlickrFill icon component.
 *
 * @example FlickrFill <> FlickrFillProps(size = 24, color = "blue")
 */
def FlickrFill = (props: FlickrFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 12C11 14.7615 8.76146 17 5.99998 17 3.23849 17 1 14.7615 1 12 1 9.23899 3.23849 7 5.99998 7 8.76146 7 11 9.23899 11 12ZM23 12C23 14.7615 20.7615 17 18 17 15.2385 17 13 14.7615 13 12 13 9.23899 15.2385 7 18 7 20.7615 7 23 9.23899 23 12Z")
  )
}
