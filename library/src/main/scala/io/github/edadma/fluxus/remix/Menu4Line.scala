/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Menu4Line icon from the Remix Icon library, System category.
 */
case class Menu4LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Menu4Line icon component.
 *
 * @example Menu4Line <> Menu4LineProps(size = 24, color = "blue")
 */
def Menu4Line = (props: Menu4LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 18V20H5V18H16ZM21 11V13H3V11H21ZM19 4V6H8V4H19Z")
  )
}
