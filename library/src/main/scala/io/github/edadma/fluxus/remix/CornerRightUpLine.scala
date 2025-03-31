/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerRightUpLine icon from the Remix Icon library, Arrows category.
 */
case class CornerRightUpLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerRightUpLine icon component.
 *
 * @example CornerRightUpLine <> CornerRightUpLineProps(size = 24, color = "blue")
 */
def CornerRightUpLine = (props: CornerRightUpLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.9999 19.0001L5.00003 19.0002L5 17.0002L11.9999 17.0001L12 6.8283L8.05027 10.778L6.63606 9.36381L13 2.99985L19.364 9.36381L17.9498 10.778L14 6.82825L13.9999 19.0001Z")
  )
}
