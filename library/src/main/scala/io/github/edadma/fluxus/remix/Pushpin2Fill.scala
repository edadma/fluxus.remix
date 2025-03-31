/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Pushpin2Fill icon from the Remix Icon library, Map category.
 */
case class Pushpin2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Pushpin2Fill icon component.
 *
 * @example Pushpin2Fill <> Pushpin2FillProps(size = 24, color = "blue")
 */
def Pushpin2Fill = (props: Pushpin2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18 3V5H17V11L19 14V16H13V23H11V16H5V14L7 11V5H6V3H18Z")
  )
}
