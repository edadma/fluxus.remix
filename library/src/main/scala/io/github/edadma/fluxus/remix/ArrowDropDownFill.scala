/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowDropDownFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowDropDownFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowDropDownFill icon component.
 *
 * @example ArrowDropDownFill <> ArrowDropDownFillProps(size = 24, color = "blue")
 */
def ArrowDropDownFill = (props: ArrowDropDownFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 14L8 10H16L12 14Z")
  )
}
