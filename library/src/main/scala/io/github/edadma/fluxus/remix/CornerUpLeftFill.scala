/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerUpLeftFill icon from the Remix Icon library, Arrows category.
 */
case class CornerUpLeftFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerUpLeftFill icon component.
 *
 * @example CornerUpLeftFill <> CornerUpLeftFillProps(size = 24, color = "blue")
 */
def CornerUpLeftFill = (props: CornerUpLeftFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19.0001 10.0001L19.0003 19L17.0003 19L17.0002 12.0001L9.41409 12V17.4142L2.99988 11L9.41409 4.58578L9.41409 10L19.0001 10.0001Z")
  )
}
