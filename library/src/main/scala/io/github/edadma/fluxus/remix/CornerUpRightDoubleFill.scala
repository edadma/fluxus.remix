/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerUpRightDoubleFill icon from the Remix Icon library, Arrows category.
 */
case class CornerUpRightDoubleFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerUpRightDoubleFill icon component.
 *
 * @example CornerUpRightDoubleFill <> CornerUpRightDoubleFillProps(size = 24, color = "blue")
 */
def CornerUpRightDoubleFill = (props: CornerUpRightDoubleFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3.99969 19.0001 3.99983 10.0002 9.58588 10.0002V4.58588L16.0001 11.0001 9.58588 17.4143V12.0002L5.9998 12.0002 5.99969 19.0001 3.99969 19.0001ZM13.8363 6.05023 15.2505 4.63601 21.6145 11 15.2505 17.3639 13.8363 15.9497 18.7861 11 13.8363 6.05023Z")
  )
}
