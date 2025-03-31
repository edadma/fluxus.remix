/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerUpLeftDoubleFill icon from the Remix Icon library, Arrows category.
 */
case class CornerUpLeftDoubleFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerUpLeftDoubleFill icon component.
 *
 * @example CornerUpLeftDoubleFill <> CornerUpLeftDoubleFillProps(size = 24, color = "blue")
 */
def CornerUpLeftDoubleFill = (props: CornerUpLeftDoubleFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20.0003 19.0001 20.0002 10.0002 14.4142 10.0002V4.58588L7.99995 11.0001 14.4142 17.4143V12.0002L18.0002 12.0002 18.0003 19.0001 20.0003 19.0001ZM10.1637 6.05023 8.74952 4.63601 2.38556 11 8.74952 17.3639 10.1637 15.9497 5.21399 11 10.1637 6.05023Z")
  )
}
