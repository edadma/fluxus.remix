/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandLeftRightFill icon from the Remix Icon library, Arrows category.
 */
case class ExpandLeftRightFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandLeftRightFill icon component.
 *
 * @example ExpandLeftRightFill <> ExpandLeftRightFillProps(size = 24, color = "blue")
 */
def ExpandLeftRightFill = (props: ExpandLeftRightFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9 6 3 12 9 18V6ZM15 18 21 12 15 6V18Z")
  )
}
