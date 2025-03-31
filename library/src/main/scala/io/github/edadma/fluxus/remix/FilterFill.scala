/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FilterFill icon from the Remix Icon library, System category.
 */
case class FilterFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FilterFill icon component.
 *
 * @example FilterFill <> FilterFillProps(size = 24, color = "blue")
 */
def FilterFill = (props: FilterFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 4V6H20L14 15V22H10V15L4 6H3V4H21Z")
  )
}
