/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerUpRightFill icon from the Remix Icon library, Arrows category.
 */
case class CornerUpRightFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerUpRightFill icon component.
 *
 * @example CornerUpRightFill <> CornerUpRightFillProps(size = 24, color = "blue")
 */
def CornerUpRightFill = (props: CornerUpRightFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.99989 10.0001L4.99976 19L6.99976 19L6.99986 12.0001L14.5859 12V17.4142L21.0001 11L14.5859 4.58578L14.5859 10L4.99989 10.0001Z")
  )
}
