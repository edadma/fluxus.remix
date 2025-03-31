/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowDownFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowDownFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowDownFill icon component.
 *
 * @example ArrowDownFill <> ArrowDownFillProps(size = 24, color = "blue")
 */
def ArrowDownFill = (props: ArrowDownFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 12H20L12 20L4 12H11V4H13V12Z")
  )
}
