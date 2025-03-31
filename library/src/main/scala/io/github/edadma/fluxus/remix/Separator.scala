/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Separator icon from the Remix Icon library, Editor category.
 */
case class SeparatorProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Separator icon component.
 *
 * @example Separator <> SeparatorProps(size = 24, color = "blue")
 */
def Separator = (props: SeparatorProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 11H4V13H2V11ZM6 11H18V13H6V11ZM20 11H22V13H20V11Z")
  )
}
