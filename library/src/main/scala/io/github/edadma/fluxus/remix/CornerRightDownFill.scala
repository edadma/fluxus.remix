/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerRightDownFill icon from the Remix Icon library, Arrows category.
 */
case class CornerRightDownFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerRightDownFill icon component.
 *
 * @example CornerRightDownFill <> CornerRightDownFillProps(size = 24, color = "blue")
 */
def CornerRightDownFill = (props: CornerRightDownFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.9999 4.99989L5.00003 4.99976L5 6.99976L11.9999 6.99986L12 14.5859H6.58581L13 21.0001L19.4142 14.5859L14 14.5859L13.9999 4.99989Z")
  )
}
