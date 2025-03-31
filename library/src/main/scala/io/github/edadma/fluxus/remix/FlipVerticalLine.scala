/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FlipVerticalLine icon from the Remix Icon library, Design category.
 */
case class FlipVerticalLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FlipVerticalLine icon component.
 *
 * @example FlipVerticalLine <> FlipVerticalLineProps(size = 24, color = "blue")
 */
def FlipVerticalLine = (props: FlipVerticalLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22 11L2 11L2 13L22 13V11ZM18 2C19.1046 2 20 2.89543 20 4V7C20 8.10457 19.1046 9 18 9L6 9C4.89543 9 4 8.10457 4 7L4 4C4 2.89543 4.89543 2 6 2L18 2ZM18 20H6V17L18 17V20ZM20 17C20 15.8954 19.1046 15 18 15L6 15C4.89543 15 4 15.8954 4 17L4 20C4 21.1046 4.89543 22 6 22H18C19.1046 22 20 21.1046 20 20V17Z")
  )
}
