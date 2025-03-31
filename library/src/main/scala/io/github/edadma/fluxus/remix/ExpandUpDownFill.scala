/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandUpDownFill icon from the Remix Icon library, Arrows category.
 */
case class ExpandUpDownFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandUpDownFill icon component.
 *
 * @example ExpandUpDownFill <> ExpandUpDownFillProps(size = 24, color = "blue")
 */
def ExpandUpDownFill = (props: ExpandUpDownFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18 9 12 3 6 9H18ZM18 15 12 21 6 15H18Z")
  )
}
