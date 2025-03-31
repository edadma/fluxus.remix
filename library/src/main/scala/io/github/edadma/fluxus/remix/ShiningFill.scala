/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ShiningFill icon from the Remix Icon library, Weather category.
 */
case class ShiningFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ShiningFill icon component.
 *
 * @example ShiningFill <> ShiningFillProps(size = 24, color = "blue")
 */
def ShiningFill = (props: ShiningFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M1 11C6.52285 11 11 6.52285 11 1H13C13 6.52285 17.4772 11 23 11V13C17.4772 13 13 17.4772 13 23H11C11 17.4772 6.52285 13 1 13V11Z")
  )
}
