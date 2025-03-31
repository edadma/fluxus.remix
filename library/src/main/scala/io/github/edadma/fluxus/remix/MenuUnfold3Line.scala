/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MenuUnfold3Line icon from the Remix Icon library, System category.
 */
case class MenuUnfold3LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MenuUnfold3Line icon component.
 *
 * @example MenuUnfold3Line <> MenuUnfold3LineProps(size = 24, color = "blue")
 */
def MenuUnfold3Line = (props: MenuUnfold3LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 4H3V6H17V4ZM13 11H3V13H13V11ZM17 18H3V20H17V18ZM15.9896 8.81412L17.4038 7.3999L22 11.9961L17.4038 16.5923L15.9896 15.1781L19.1716 11.9961L15.9896 8.81412Z")
  )
}
