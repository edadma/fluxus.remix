/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DiscussLine icon from the Remix Icon library, Communication category.
 */
case class DiscussLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DiscussLine icon component.
 *
 * @example DiscussLine <> DiscussLineProps(size = 24, color = "blue")
 */
def DiscussLine = (props: DiscussLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14 22.5L11.2 19H6C5.44772 19 5 18.5523 5 18V7.10256C5 6.55028 5.44772 6.10256 6 6.10256H22C22.5523 6.10256 23 6.55028 23 7.10256V18C23 18.5523 22.5523 19 22 19H16.8L14 22.5ZM15.8387 17H21V8.10256H7V17H11.2H12.1613L14 19.2984L15.8387 17ZM2 2H19V4H3V15H1V3C1 2.44772 1.44772 2 2 2Z")
  )
}
