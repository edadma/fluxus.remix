/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerUpLeftLine icon from the Remix Icon library, Arrows category.
 */
case class CornerUpLeftLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerUpLeftLine icon component.
 *
 * @example CornerUpLeftLine <> CornerUpLeftLineProps(size = 24, color = "blue")
 */
def CornerUpLeftLine = (props: CornerUpLeftLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19.0001 10.0001L19.0003 19L17.0003 19L17.0002 12.0001L6.82833 12L10.7781 15.9498L9.36384 17.364L2.99988 11L9.36384 4.63605L10.7781 6.05026L6.82828 10L19.0001 10.0001Z")
  )
}
