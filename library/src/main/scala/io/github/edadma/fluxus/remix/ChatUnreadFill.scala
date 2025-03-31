/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ChatUnreadFill icon from the Remix Icon library, Communication category.
 */
case class ChatUnreadFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ChatUnreadFill icon component.
 *
 * @example ChatUnreadFill <> ChatUnreadFillProps(size = 24, color = "blue")
 */
def ChatUnreadFill = (props: ChatUnreadFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 7C22.6569 7 24 5.65685 24 4C24 2.34315 22.6569 1 21 1C19.3431 1 18 2.34315 18 4C18 5.65685 19.3431 7 21 7ZM21 9C21.3425 9 21.6769 8.96557 22 8.89998V18C22 18.5523 21.5523 19 21 19H6.45455L2 22.5V4C2 3.44772 2.44772 3 3 3H16.1C16.0344 3.32311 16 3.65753 16 4C16 6.76142 18.2386 9 21 9Z")
  )
}
