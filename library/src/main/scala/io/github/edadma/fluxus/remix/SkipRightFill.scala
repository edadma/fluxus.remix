/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SkipRightFill icon from the Remix Icon library, Arrows category.
 */
case class SkipRightFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SkipRightFill icon component.
 *
 * @example SkipRightFill <> SkipRightFillProps(size = 24, color = "blue")
 */
def SkipRightFill = (props: SkipRightFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 6 17 18H15L15 6 17 6ZM13 12 7 18V6L13 12Z")
  )
}
