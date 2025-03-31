/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Anticlockwise2Fill icon from the Remix Icon library, Design category.
 */
case class Anticlockwise2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Anticlockwise2Fill icon component.
 *
 * @example Anticlockwise2Fill <> Anticlockwise2FillProps(size = 24, color = "blue")
 */
def Anticlockwise2Fill = (props: Anticlockwise2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14 4H16C18.7614 4 21 6.23858 21 9V13H19V9C19 7.34315 17.6569 6 16 6H14V9L9 5L14 1V4ZM15 11V21C15 21.5523 14.5523 22 14 22H4C3.44772 22 3 21.5523 3 21V11C3 10.4477 3.44772 10 4 10H14C14.5523 10 15 10.4477 15 11Z")
  )
}
