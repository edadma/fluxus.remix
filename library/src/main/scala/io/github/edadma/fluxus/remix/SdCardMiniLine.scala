/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SdCardMiniLine icon from the Remix Icon library, Device category.
 */
case class SdCardMiniLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SdCardMiniLine icon component.
 *
 * @example SdCardMiniLine <> SdCardMiniLineProps(size = 24, color = "blue")
 */
def SdCardMiniLine = (props: SdCardMiniLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8 4V9.79335C8 10.455 7.73768 11.0897 7.27052 11.5584L6 12.8329V20H18V4H8ZM7 2H19C19.5523 2 20 2.44772 20 3V21C20 21.5523 19.5523 22 19 22H5C4.44772 22 4 21.5523 4 21V12.4196C4 12.1549 4.10493 11.901 4.29179 11.7135L5.8541 10.1464C5.94754 10.0526 6 9.92569 6 9.79335V3C6 2.44772 6.44772 2 7 2ZM15 5H17V9H15V5ZM12 5H14V9H12V5ZM9 5H11V9H9V5Z")
  )
}
