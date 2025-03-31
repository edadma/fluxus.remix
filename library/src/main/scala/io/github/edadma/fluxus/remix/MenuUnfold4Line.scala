/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MenuUnfold4Line icon from the Remix Icon library, System category.
 */
case class MenuUnfold4LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MenuUnfold4Line icon component.
 *
 * @example MenuUnfold4Line <> MenuUnfold4LineProps(size = 24, color = "blue")
 */
def MenuUnfold4Line = (props: MenuUnfold4LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 4H3V6H17V4ZM13 11H3V13H13V11ZM17 18H3V20H17V18ZM22.0104 8.81412L20.5962 7.3999L16 11.9961L20.5962 16.5923L22.0104 15.1781L18.8284 11.9961L22.0104 8.81412Z")
  )
}
