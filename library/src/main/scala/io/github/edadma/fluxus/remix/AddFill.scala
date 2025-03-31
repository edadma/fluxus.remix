/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * AddFill icon from the Remix Icon library, System category.
 */
case class AddFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * AddFill icon component.
 *
 * @example AddFill <> AddFillProps(size = 24, color = "blue")
 */
def AddFill = (props: AddFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 11V5H13V11H19V13H13V19H11V13H5V11H11Z")
  )
}
