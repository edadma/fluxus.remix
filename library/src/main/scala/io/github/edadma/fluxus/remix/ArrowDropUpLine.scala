/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowDropUpLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowDropUpLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowDropUpLine icon component.
 *
 * @example ArrowDropUpLine <> ArrowDropUpLineProps(size = 24, color = "blue")
 */
def ArrowDropUpLine = (props: ArrowDropUpLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 11.8284L9.17154 14.6569L7.75732 13.2426L12 9L16.2426 13.2426L14.8284 14.6569L12 11.8284Z")
  )
}
