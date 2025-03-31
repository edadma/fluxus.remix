/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MenuUnfold3Fill icon from the Remix Icon library, System category.
 */
case class MenuUnfold3FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MenuUnfold3Fill icon component.
 *
 * @example MenuUnfold3Fill <> MenuUnfold3FillProps(size = 24, color = "blue")
 */
def MenuUnfold3Fill = (props: MenuUnfold3FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 4H3V6H17V4ZM13 11H3V13H13V11ZM17 18H3V20H17V18ZM17 17V7L22 11.9996L17 17Z")
  )
}
