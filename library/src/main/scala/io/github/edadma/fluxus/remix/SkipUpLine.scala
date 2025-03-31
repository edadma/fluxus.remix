/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SkipUpLine icon from the Remix Icon library, Arrows category.
 */
case class SkipUpLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SkipUpLine icon component.
 *
 * @example SkipUpLine <> SkipUpLineProps(size = 24, color = "blue")
 */
def SkipUpLine = (props: SkipUpLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 13.9142L16.7929 18.7071L18.2071 17.2929L12 11.0858L5.79289 17.2929L7.20711 18.7071L12 13.9142ZM6 7L18 7V9L6 9L6 7Z")
  )
}
