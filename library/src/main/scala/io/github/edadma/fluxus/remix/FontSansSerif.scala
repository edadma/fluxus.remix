/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FontSansSerif icon from the Remix Icon library, Editor category.
 */
case class FontSansSerifProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FontSansSerif icon component.
 *
 * @example FontSansSerif <> FontSansSerifProps(size = 24, color = "blue")
 */
def FontSansSerif = (props: FontSansSerifProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5 4H19V8H17.5C17 6 17 5 15 5H10V12H13C14 12 15 11.5 15 10H16V15H15C15 13.5 14 13 13 13H10V17.5C10 20 13.5 20 13.5 20V21H5V20C7 19.5 7 18.5 7 17.5V7.5C7 6.5 7 5.5 5 5V4Z")
  )
}
