/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowDropLeftLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowDropLeftLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowDropLeftLine icon component.
 *
 * @example ArrowDropLeftLine <> ArrowDropLeftLineProps(size = 24, color = "blue")
 */
def ArrowDropLeftLine = (props: ArrowDropLeftLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11.8284 12.0005L14.6569 14.8289L13.2426 16.2431L9 12.0005L13.2426 7.75781L14.6569 9.17203L11.8284 12.0005Z")
  )
}
