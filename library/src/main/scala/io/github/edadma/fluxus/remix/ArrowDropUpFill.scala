/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowDropUpFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowDropUpFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowDropUpFill icon component.
 *
 * @example ArrowDropUpFill <> ArrowDropUpFillProps(size = 24, color = "blue")
 */
def ArrowDropUpFill = (props: ArrowDropUpFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 10L16 14H8L12 10Z")
  )
}
