/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerDownRightFill icon from the Remix Icon library, Arrows category.
 */
case class CornerDownRightFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerDownRightFill icon component.
 *
 * @example CornerDownRightFill <> CornerDownRightFillProps(size = 24, color = "blue")
 */
def CornerDownRightFill = (props: CornerDownRightFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.99989 13.9999L4.99976 5.00003L6.99976 5L6.99986 11.9999L14.5859 12V6.58581L21.0001 13L14.5859 19.4142L14.5859 14L4.99989 13.9999Z")
  )
}
