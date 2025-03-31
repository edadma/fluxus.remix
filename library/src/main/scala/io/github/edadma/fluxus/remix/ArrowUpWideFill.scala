/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowUpWideFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowUpWideFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowUpWideFill icon component.
 *
 * @example ArrowUpWideFill <> ArrowUpWideFillProps(size = 24, color = "blue")
 */
def ArrowUpWideFill = (props: ArrowUpWideFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 8.36853L20.9679 13.1162L20.0321 14.8838L12 10.6315L3.96789 14.8838L3.03211 13.1162L12 8.36853Z")
  )
}
