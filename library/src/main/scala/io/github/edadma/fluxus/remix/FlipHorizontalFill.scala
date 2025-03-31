/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FlipHorizontalFill icon from the Remix Icon library, Design category.
 */
case class FlipHorizontalFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FlipHorizontalFill icon component.
 *
 * @example FlipHorizontalFill <> FlipHorizontalFillProps(size = 24, color = "blue")
 */
def FlipHorizontalFill = (props: FlipHorizontalFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 2V22H13V2H11ZM7 6V18H4L4 6H7ZM4 4C2.89543 4 2 4.89543 2 6V18C2 19.1046 2.89543 20 4 20H7C8.10457 20 9 19.1046 9 18V6C9 4.89543 8.10457 4 7 4H4ZM15 6C15 4.89543 15.8954 4 17 4H20C21.1046 4 22 4.89543 22 6V18C22 19.1046 21.1046 20 20 20H17C15.8954 20 15 19.1046 15 18V6Z")
  )
}
