/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowUpSFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowUpSFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowUpSFill icon component.
 *
 * @example ArrowUpSFill <> ArrowUpSFillProps(size = 24, color = "blue")
 */
def ArrowUpSFill = (props: ArrowUpSFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 8L18 14H6L12 8Z")
  )
}
