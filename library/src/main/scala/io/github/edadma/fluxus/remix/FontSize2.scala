/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FontSize2 icon from the Remix Icon library, Editor category.
 */
case class FontSize2Props(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FontSize2 icon component.
 *
 * @example FontSize2 <> FontSize2Props(size = 24, color = "blue")
 */
def FontSize2 = (props: FontSize2Props) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10 6V21H8V6H2V4H16V6H10ZM18 14V21H16V14H13V12H21V14H18Z")
  )
}
