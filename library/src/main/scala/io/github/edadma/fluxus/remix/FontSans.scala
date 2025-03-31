/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FontSans icon from the Remix Icon library, Editor category.
 */
case class FontSansProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FontSans icon component.
 *
 * @example FontSans <> FontSansProps(size = 24, color = "blue")
 */
def FontSans = (props: FontSansProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 4H19V6H10V12H18V14H10V21H7V4Z")
  )
}
