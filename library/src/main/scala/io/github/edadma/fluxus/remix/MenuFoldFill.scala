/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MenuFoldFill icon from the Remix Icon library, System category.
 */
case class MenuFoldFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MenuFoldFill icon component.
 *
 * @example MenuFoldFill <> MenuFoldFillProps(size = 24, color = "blue")
 */
def MenuFoldFill = (props: MenuFoldFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 17.9996V19.9996H3V17.9996H21ZM7 3.5V13.5L2 8.49955L7 3.5ZM21 10.9996V12.9996H12V10.9996H21ZM21 3.99955V5.99955H12V3.99955H21Z")
  )
}
