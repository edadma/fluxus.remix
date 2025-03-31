/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowUpLongFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowUpLongFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowUpLongFill icon component.
 *
 * @example ArrowUpLongFill <> ArrowUpLongFillProps(size = 24, color = "blue")
 */
def ArrowUpLongFill = (props: ArrowUpLongFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11.0001 22.0003L13 22.0004L13 8.41421L18.4142 8.41421L12 2L5.58575 8.41421L11 8.41421L11.0001 22.0003Z")
  )
}
