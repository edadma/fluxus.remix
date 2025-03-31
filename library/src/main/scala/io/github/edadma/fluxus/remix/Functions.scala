/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Functions icon from the Remix Icon library, Editor category.
 */
case class FunctionsProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Functions icon component.
 *
 * @example Functions <> FunctionsProps(size = 24, color = "blue")
 */
def Functions = (props: FunctionsProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5 18L12.6796 12L5 6V4H19V6H8.26348L16 12L8.26348 18H19V20H5V18Z")
  )
}
