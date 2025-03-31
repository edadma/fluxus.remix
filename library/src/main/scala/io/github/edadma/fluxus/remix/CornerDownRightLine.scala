/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerDownRightLine icon from the Remix Icon library, Arrows category.
 */
case class CornerDownRightLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerDownRightLine icon component.
 *
 * @example CornerDownRightLine <> CornerDownRightLineProps(size = 24, color = "blue")
 */
def CornerDownRightLine = (props: CornerDownRightLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.99989 13.9999L4.99976 5L6.99976 4.99997L6.99986 11.9999L17.1717 12L13.222 8.05024L14.6362 6.63603L21.0001 13L14.6362 19.364L13.222 17.9497L17.1717 14L4.99989 13.9999Z")
  )
}
