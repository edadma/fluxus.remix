/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * InboxLine icon from the Remix Icon library, Business category.
 */
case class InboxLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * InboxLine icon component.
 *
 * @example InboxLine <> InboxLineProps(size = 24, color = "blue")
 */
def InboxLine = (props: InboxLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 3C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H21ZM7.41604 14H4V19H20V14H16.584C15.8124 15.7659 14.0503 17 12 17C9.94968 17 8.1876 15.7659 7.41604 14ZM20 5H4V12H9C9 13.6569 10.3431 15 12 15C13.6569 15 15 13.6569 15 12H20V5Z")
  )
}
