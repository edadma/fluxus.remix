/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FontMono icon from the Remix Icon library, Editor category.
 */
case class FontMonoProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FontMono icon component.
 *
 * @example FontMono <> FontMonoProps(size = 24, color = "blue")
 */
def FontMono = (props: FontMonoProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6 4H19V6H8V12H18V14H8V21H6V4Z")
  )
}
