/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandDiagonal2Fill icon from the Remix Icon library, Arrows category.
 */
case class ExpandDiagonal2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandDiagonal2Fill icon component.
 *
 * @example ExpandDiagonal2Fill <> ExpandDiagonal2FillProps(size = 24, color = "blue")
 */
def ExpandDiagonal2Fill = (props: ExpandDiagonal2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 3H10.5L7.45711 6.04289L10.7071 9.29289L9.29289 10.7071L6.04289 7.45711L3 10.5V3ZM21 21H13.5L16.5429 17.9571L13.2929 14.7071L14.7071 13.2929L17.9571 16.5429L21 13.5V21Z")
  )
}
