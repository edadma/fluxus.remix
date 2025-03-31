/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerRightUpFill icon from the Remix Icon library, Arrows category.
 */
case class CornerRightUpFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerRightUpFill icon component.
 *
 * @example CornerRightUpFill <> CornerRightUpFillProps(size = 24, color = "blue")
 */
def CornerRightUpFill = (props: CornerRightUpFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.9999 19.0001L5.00003 19.0002L5 17.0002L11.9999 17.0001L12 9.41405H6.58581L13 2.99985L19.4142 9.41405L14 9.41406L13.9999 19.0001Z")
  )
}
