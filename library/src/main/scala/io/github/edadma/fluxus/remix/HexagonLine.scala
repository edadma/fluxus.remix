/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * HexagonLine icon from the Remix Icon library, Design category.
 */
case class HexagonLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * HexagonLine icon component.
 *
 * @example HexagonLine <> HexagonLineProps(size = 24, color = "blue")
 */
def HexagonLine = (props: HexagonLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17.5 2.5L23 12L17.5 21.5H6.5L1 12L6.5 2.5H17.5ZM16.3469 4.5H7.65311L3.311 12L7.65311 19.5H16.3469L20.689 12L16.3469 4.5Z")
  )
}
