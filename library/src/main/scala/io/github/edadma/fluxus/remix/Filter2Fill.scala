/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Filter2Fill icon from the Remix Icon library, System category.
 */
case class Filter2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Filter2Fill icon component.
 *
 * @example Filter2Fill <> Filter2FillProps(size = 24, color = "blue")
 */
def Filter2Fill = (props: Filter2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10 14L4 5V3H20V5L14 14V20L10 22V14Z")
  )
}
