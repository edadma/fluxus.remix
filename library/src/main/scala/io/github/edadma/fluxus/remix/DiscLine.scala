/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DiscLine icon from the Remix Icon library, Media category.
 */
case class DiscLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DiscLine icon component.
 *
 * @example DiscLine <> DiscLineProps(size = 24, color = "blue")
 */
def DiscLine = (props: DiscLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15 4.58152V12C15 13.6569 13.6569 15 12 15C10.3431 15 9 13.6569 9 12C9 10.3431 10.3431 9 12 9C12.3506 9 12.6872 9.06016 13 9.17071V2.04938C18.0533 2.5511 22 6.81465 22 12C22 17.5229 17.5228 22 12 22C6.47715 22 2 17.5229 2 12C2 6.81465 5.94668 2.5511 11 2.04938V4.0619C7.05369 4.55399 4 7.92038 4 12C4 16.4183 7.58172 20 12 20C16.4183 20 20 16.4183 20 12C20 8.64262 17.9318 5.76829 15 4.58152Z")
  )
}
