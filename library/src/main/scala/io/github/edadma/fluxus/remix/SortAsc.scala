/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SortAsc icon from the Remix Icon library, Editor category.
 */
case class SortAscProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SortAsc icon component.
 *
 * @example SortAsc <> SortAscProps(size = 24, color = "blue")
 */
def SortAsc = (props: SortAscProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19 3L23 8H20V20H18V8H15L19 3ZM14 18V20H3V18H14ZM14 11V13H3V11H14ZM12 4V6H3V4H12Z")
  )
}
