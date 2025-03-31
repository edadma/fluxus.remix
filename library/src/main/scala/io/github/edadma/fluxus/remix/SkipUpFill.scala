/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SkipUpFill icon from the Remix Icon library, Arrows category.
 */
case class SkipUpFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SkipUpFill icon component.
 *
 * @example SkipUpFill <> SkipUpFillProps(size = 24, color = "blue")
 */
def SkipUpFill = (props: SkipUpFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6 7 18 7V9L6 9 6 7ZM12 11 6 17H18L12 11Z")
  )
}
