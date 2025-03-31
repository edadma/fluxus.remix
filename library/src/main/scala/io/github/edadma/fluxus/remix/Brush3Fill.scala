/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Brush3Fill icon from the Remix Icon library, Design category.
 */
case class Brush3FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Brush3Fill icon component.
 *
 * @example Brush3Fill <> Brush3FillProps(size = 24, color = "blue")
 */
def Brush3Fill = (props: Brush3FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 10.9967V7.9967H14V3.9967H10V7.9967H4V10.9967H20ZM21 12.9967V20.9967C21 21.549 20.5523 21.9967 20 21.9967H10V15.9967H8V21.9967H4C3.44772 21.9967 3 21.549 3 20.9967V12.9967H2V6.9967C2 6.44442 2.44772 5.9967 3 5.9967H8V2.9967C8 2.44442 8.44772 1.9967 9 1.9967H15C15.5523 1.9967 16 2.44442 16 2.9967V5.9967H21C21.5523 5.9967 22 6.44442 22 6.9967V12.9967H21Z")
  )
}
