/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerUpRightLine icon from the Remix Icon library, Arrows category.
 */
case class CornerUpRightLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerUpRightLine icon component.
 *
 * @example CornerUpRightLine <> CornerUpRightLineProps(size = 24, color = "blue")
 */
def CornerUpRightLine = (props: CornerUpRightLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.99989 10.0001L4.99976 19L6.99976 19L6.99986 12.0001L17.1717 12L13.222 15.9498L14.6362 17.364L21.0001 11L14.6362 4.63605L13.222 6.05026L17.1717 10L4.99989 10.0001Z")
  )
}
