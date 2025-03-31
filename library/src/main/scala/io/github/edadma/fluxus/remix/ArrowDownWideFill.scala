/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowDownWideFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowDownWideFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowDownWideFill icon component.
 *
 * @example ArrowDownWideFill <> ArrowDownWideFillProps(size = 24, color = "blue")
 */
def ArrowDownWideFill = (props: ArrowDownWideFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 15.6315L20.9679 10.8838L20.0321 9.11619L12 13.3685L3.9679 9.11619L3.03212 10.8838L12 15.6315Z")
  )
}
