/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Heading icon from the Remix Icon library, Editor category.
 */
case class HeadingProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Heading icon component.
 *
 * @example Heading <> HeadingProps(size = 24, color = "blue")
 */
def Heading = (props: HeadingProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 11V4H19V21H17V13H7V21H5V4H7V11H17Z")
  )
}
