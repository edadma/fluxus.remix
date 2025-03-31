/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MenuFold3Fill icon from the Remix Icon library, System category.
 */
case class MenuFold3FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MenuFold3Fill icon component.
 *
 * @example MenuFold3Fill <> MenuFold3FillProps(size = 24, color = "blue")
 */
def MenuFold3Fill = (props: MenuFold3FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 4H7V6H21V4ZM21 11H11V13H21V11ZM21 18H7V20H21V18ZM8 17V7L3 11.9996L8 17Z")
  )
}
