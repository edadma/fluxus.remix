/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerDownLeftLine icon from the Remix Icon library, Arrows category.
 */
case class CornerDownLeftLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerDownLeftLine icon component.
 *
 * @example CornerDownLeftLine <> CornerDownLeftLineProps(size = 24, color = "blue")
 */
def CornerDownLeftLine = (props: CornerDownLeftLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19.0001 13.9999L19.0002 5L17.0002 4.99997L17.0001 11.9999L6.8283 12L10.778 8.05024L9.36382 6.63603L2.99986 13L9.36382 19.364L10.778 17.9497L6.82826 14L19.0001 13.9999Z")
  )
}
