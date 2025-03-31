/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BracketsLine icon from the Remix Icon library, Development category.
 */
case class BracketsLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BracketsLine icon component.
 *
 * @example BracketsLine <> BracketsLineProps(size = 24, color = "blue")
 */
def BracketsLine = (props: BracketsLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9 3V5H6V19H9V21H4V3H9ZM15 3H20V21H15V19H18V5H15V3Z")
  )
}
