/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Overline icon from the Remix Icon library, Editor category.
 */
case class OverlineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Overline icon component.
 *
 * @example Overline <> OverlineProps(size = 24, color = "blue")
 */
def Overline = (props: OverlineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.2459 18H8.75407L7.15407 22H5L11 7H13L19 22H16.8459L15.2459 18ZM14.4459 16L12 9.88516L9.55407 16H14.4459ZM4 3H20V5H4V3Z")
  )
}
