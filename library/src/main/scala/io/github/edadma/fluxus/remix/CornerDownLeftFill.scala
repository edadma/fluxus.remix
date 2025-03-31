/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerDownLeftFill icon from the Remix Icon library, Arrows category.
 */
case class CornerDownLeftFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerDownLeftFill icon component.
 *
 * @example CornerDownLeftFill <> CornerDownLeftFillProps(size = 24, color = "blue")
 */
def CornerDownLeftFill = (props: CornerDownLeftFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19.0001 13.9999L19.0002 5.00003L17.0002 5L17.0001 11.9999L9.41406 12V6.58581L2.99986 13L9.41406 19.4142L9.41406 14L19.0001 13.9999Z")
  )
}
