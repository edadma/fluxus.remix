/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SubtractFill icon from the Remix Icon library, System category.
 */
case class SubtractFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SubtractFill icon component.
 *
 * @example SubtractFill <> SubtractFillProps(size = 24, color = "blue")
 */
def SubtractFill = (props: SubtractFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19 11H5V13H19V11Z")
  )
}
