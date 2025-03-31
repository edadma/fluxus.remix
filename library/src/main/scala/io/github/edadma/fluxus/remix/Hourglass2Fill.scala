/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Hourglass2Fill icon from the Remix Icon library, System category.
 */
case class Hourglass2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Hourglass2Fill icon component.
 *
 * @example Hourglass2Fill <> Hourglass2FillProps(size = 24, color = "blue")
 */
def Hourglass2Fill = (props: Hourglass2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 2H20V6.45994L13.5366 12L20 17.5401V22H4V17.5401L10.4634 12L4 6.45994V2ZM16.2967 7L18 5.54007V4H6V5.54007L7.70326 7H16.2967ZM12 13.3171L6 18.4599V20H7L12 17L17 20H18V18.4599L12 13.3171Z")
  )
}
