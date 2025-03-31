/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Number7 icon from the Remix Icon library, Editor category.
 */
case class Number7Props(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Number7 icon component.
 *
 * @example Number7 <> Number7Props(size = 24, color = "blue")
 */
def Number7 = (props: Number7Props) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19 2V3.5L10.763 21.9995H8.574L16.587 4H6V2H19Z")
  )
}
