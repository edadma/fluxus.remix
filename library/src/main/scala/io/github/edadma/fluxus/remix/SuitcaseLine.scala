/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SuitcaseLine icon from the Remix Icon library, Map category.
 */
case class SuitcaseLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SuitcaseLine icon component.
 *
 * @example SuitcaseLine <> SuitcaseLineProps(size = 24, color = "blue")
 */
def SuitcaseLine = (props: SuitcaseLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15 3C15.5523 3 16 3.44772 16 4V6H21C21.5523 6 22 6.44772 22 7V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V7C2 6.44772 2.44772 6 3 6H8V4C8 3.44772 8.44772 3 9 3H15ZM16 8H8V19H16V8ZM4 8V19H6V8H4ZM14 5H10V6H14V5ZM18 8V19H20V8H18Z")
  )
}
