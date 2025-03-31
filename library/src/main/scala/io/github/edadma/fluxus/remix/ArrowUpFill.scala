/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowUpFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowUpFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowUpFill icon component.
 *
 * @example ArrowUpFill <> ArrowUpFillProps(size = 24, color = "blue")
 */
def ArrowUpFill = (props: ArrowUpFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 12V20H11V12H4L12 4L20 12H13Z")
  )
}
