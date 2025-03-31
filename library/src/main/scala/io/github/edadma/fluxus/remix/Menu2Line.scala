/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Menu2Line icon from the Remix Icon library, System category.
 */
case class Menu2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Menu2Line icon component.
 *
 * @example Menu2Line <> Menu2LineProps(size = 24, color = "blue")
 */
def Menu2Line = (props: Menu2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 4H21V6H3V4ZM3 11H15V13H3V11ZM3 18H21V20H3V18Z")
  )
}
