/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MenuUnfoldFill icon from the Remix Icon library, System category.
 */
case class MenuUnfoldFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MenuUnfoldFill icon component.
 *
 * @example MenuUnfoldFill <> MenuUnfoldFillProps(size = 24, color = "blue")
 */
def MenuUnfoldFill = (props: MenuUnfoldFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 17.9996V19.9996H3V17.9996H21ZM17 3.5L22 8.49955L17 13.5V3.5ZM12 10.9996V12.9996H3V10.9996H12ZM12 3.99955V5.99955H3V3.99955H12Z")
  )
}
