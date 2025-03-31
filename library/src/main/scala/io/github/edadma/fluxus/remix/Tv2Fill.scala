/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Tv2Fill icon from the Remix Icon library, Device category.
 */
case class Tv2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Tv2Fill icon component.
 *
 * @example Tv2Fill <> Tv2FillProps(size = 24, color = "blue")
 */
def Tv2Fill = (props: Tv2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 4.00087C2 3.44811 2.45531 3 2.9918 3H21.0082C21.556 3 22 3.44463 22 4.00087V17.9991C22 18.5519 21.5447 19 21.0082 19H2.9918C2.44405 19 2 18.5554 2 17.9991V4.00087ZM5 20H19V22H5V20Z")
  )
}
