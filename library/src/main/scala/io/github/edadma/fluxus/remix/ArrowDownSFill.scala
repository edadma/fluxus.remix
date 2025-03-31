/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowDownSFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowDownSFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowDownSFill icon component.
 *
 * @example ArrowDownSFill <> ArrowDownSFillProps(size = 24, color = "blue")
 */
def ArrowDownSFill = (props: ArrowDownSFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 16L6 10H18L12 16Z")
  )
}
