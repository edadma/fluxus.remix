/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SubtractLine icon from the Remix Icon library, System category.
 */
case class SubtractLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SubtractLine icon component.
 *
 * @example SubtractLine <> SubtractLineProps(size = 24, color = "blue")
 */
def SubtractLine = (props: SubtractLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5 11V13H19V11H5Z")
  )
}
