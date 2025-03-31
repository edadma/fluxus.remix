/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Menu5Fill icon from the Remix Icon library, System category.
 */
case class Menu5FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Menu5Fill icon component.
 *
 * @example Menu5Fill <> Menu5FillProps(size = 24, color = "blue")
 */
def Menu5Fill = (props: Menu5FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18 18V20H6V18H18ZM21 11V13H3V11H21ZM18 4V6H6V4H18Z")
  )
}
