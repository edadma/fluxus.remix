/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerUpLeftDoubleLine icon from the Remix Icon library, Arrows category.
 */
case class CornerUpLeftDoubleLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerUpLeftDoubleLine icon component.
 *
 * @example CornerUpLeftDoubleLine <> CornerUpLeftDoubleLineProps(size = 24, color = "blue")
 */
def CornerUpLeftDoubleLine = (props: CornerUpLeftDoubleLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 10.0003L20.0002 19.0001L18.0002 19.0002L18 12.0002L11.8282 12.0002L15.7779 15.9499L14.3637 17.3641L7.99976 11.0001L14.3637 4.63617L15.7779 6.05038L11.8282 10.0002L20 10.0003ZM8.74958 4.63617L10.1638 6.05038L5.21405 11.0001L10.1638 15.9499L8.74958 17.3641L2.38562 11.0001L8.74958 4.63617Z")
  )
}
