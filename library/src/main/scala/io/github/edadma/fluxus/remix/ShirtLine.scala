/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ShirtLine icon from the Remix Icon library, Others category.
 */
case class ShirtLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ShirtLine icon component.
 *
 * @example ShirtLine <> ShirtLineProps(size = 24, color = "blue")
 */
def ShirtLine = (props: ShirtLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.998 20H18.998V16H14.998V14H18.998V6H16.998V11L12.998 9.4V20ZM10.998 20V9.4L6.99805 11V6H4.99805V20H10.998ZM6.99805 4V3H16.998V4H19.998C20.5503 4 20.998 4.44772 20.998 5V21C20.998 21.5523 20.5503 22 19.998 22H3.99805C3.44576 22 2.99805 21.5523 2.99805 21V5C2.99805 4.44772 3.44576 4 3.99805 4H6.99805ZM11.998 8L15.498 5H8.49805L11.998 8Z")
  )
}
