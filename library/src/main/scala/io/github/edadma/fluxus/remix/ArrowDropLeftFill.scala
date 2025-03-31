/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowDropLeftFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowDropLeftFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowDropLeftFill icon component.
 *
 * @example ArrowDropLeftFill <> ArrowDropLeftFillProps(size = 24, color = "blue")
 */
def ArrowDropLeftFill = (props: ArrowDropLeftFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9 12L13 8V16L9 12Z")
  )
}
