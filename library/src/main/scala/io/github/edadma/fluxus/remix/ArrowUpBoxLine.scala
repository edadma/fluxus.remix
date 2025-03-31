/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowUpBoxLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowUpBoxLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowUpBoxLine icon component.
 *
 * @example ArrowUpBoxLine <> ArrowUpBoxLineProps(size = 24, color = "blue")
 */
def ArrowUpBoxLine = (props: ArrowUpBoxLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 3H4C3.44772 3 3 3.44772 3 4V20C3 20.5523 3.44772 21 4 21H20C20.5523 21 21 20.5523 21 20V4C21 3.44772 20.5523 3 20 3ZM5 19V5H19V19H5ZM12 6.34311L6.34315 12L7.75736 13.4142L11 10.1715V17.6568H13V10.1715L16.2426 13.4142L17.6569 12L12 6.34311Z")
  )
}
