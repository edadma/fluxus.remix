/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * RectangleLine icon from the Remix Icon library, Design category.
 */
case class RectangleLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * RectangleLine icon component.
 *
 * @example RectangleLine <> RectangleLineProps(size = 24, color = "blue")
 */
def RectangleLine = (props: RectangleLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 4H21C21.5523 4 22 4.44772 22 5V19C22 19.5523 21.5523 20 21 20H3C2.44772 20 2 19.5523 2 19V5C2 4.44772 2.44772 4 3 4ZM4 6V18H20V6H4Z")
  )
}
