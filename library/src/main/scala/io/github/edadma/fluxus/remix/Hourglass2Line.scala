/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Hourglass2Line icon from the Remix Icon library, System category.
 */
case class Hourglass2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Hourglass2Line icon component.
 *
 * @example Hourglass2Line <> Hourglass2LineProps(size = 24, color = "blue")
 */
def Hourglass2Line = (props: Hourglass2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 2H20V6.45994L13.5366 12L20 17.5401V22H4V17.5401L10.4634 12L4 6.45994V2ZM12 10.6829L18 5.54007V4H6V5.54007L12 10.6829ZM12 13.3171L6 18.4599V20H18V18.4599L12 13.3171Z")
  )
}
