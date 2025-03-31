/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * WomenLine icon from the Remix Icon library, User & Faces category.
 */
case class WomenLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * WomenLine icon component.
 *
 * @example WomenLine <> WomenLineProps(size = 24, color = "blue")
 */
def WomenLine = (props: WomenLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 15.9339C7.33064 15.445 4.5 12.3031 4.5 8.5C4.5 4.35786 7.85786 1 12 1C16.1421 1 19.5 4.35786 19.5 8.5C19.5 12.3031 16.6694 15.445 13 15.9339V18H18V20H13V24H11V20H6V18H11V15.9339ZM12 14C15.0376 14 17.5 11.5376 17.5 8.5C17.5 5.46243 15.0376 3 12 3C8.96243 3 6.5 5.46243 6.5 8.5C6.5 11.5376 8.96243 14 12 14Z")
  )
}
