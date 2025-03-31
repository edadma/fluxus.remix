/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * EarthquakeFill icon from the Remix Icon library, Weather category.
 */
case class EarthquakeFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * EarthquakeFill icon component.
 *
 * @example EarthquakeFill <> EarthquakeFillProps(size = 24, color = "blue")
 */
def EarthquakeFill = (props: EarthquakeFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11.3273 1.6115C11.677 1.29365 12.1956 1.26716 12.5734 1.53204L12.6727 1.6115L23 11H20V20C20 20.5128 19.614 20.9355 19.1166 20.9933L19 21H12.5L15 17L11.5 14L15.5 11L13 8.99998L13.5 5.99998L10.5 8.99998L13 11L8 14L11.75 17.5L8.5 21H5C4.48716 21 4.06449 20.6139 4.00673 20.1166L4 20V11H1L11.3273 1.6115Z")
  )
}
