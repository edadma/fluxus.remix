/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowUpDownFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowUpDownFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowUpDownFill icon component.
 *
 * @example ArrowUpDownFill <> ArrowUpDownFillProps(size = 24, color = "blue")
 */
def ArrowUpDownFill = (props: ArrowUpDownFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 8H8.001L8 20H6V8H2L7 3L12 8ZM22 16L17 21L12 16H16V4H18V16H22Z")
  )
}
