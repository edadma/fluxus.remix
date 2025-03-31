/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CursorFill icon from the Remix Icon library, Development category.
 */
case class CursorFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CursorFill icon component.
 *
 * @example CursorFill <> CursorFillProps(size = 24, color = "blue")
 */
def CursorFill = (props: CursorFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.9093 12.3603L17.0007 20.8537L14.1816 21.8798L11.0902 13.3864L6.91797 16.5422L8.4087 1.63318L19.134 12.0959L13.9093 12.3603Z")
  )
}
