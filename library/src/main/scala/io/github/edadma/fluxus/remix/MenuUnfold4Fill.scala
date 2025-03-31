/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MenuUnfold4Fill icon from the Remix Icon library, System category.
 */
case class MenuUnfold4FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MenuUnfold4Fill icon component.
 *
 * @example MenuUnfold4Fill <> MenuUnfold4FillProps(size = 24, color = "blue")
 */
def MenuUnfold4Fill = (props: MenuUnfold4FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 4H3V6H17V4ZM13 11H3V13H13V11ZM17 18H3V20H17V18ZM21 17V7L16 11.9996L21 17Z")
  )
}
