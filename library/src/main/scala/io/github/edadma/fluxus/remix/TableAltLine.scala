/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TableAltLine icon from the Remix Icon library, Design category.
 */
case class TableAltLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TableAltLine icon component.
 *
 * @example TableAltLine <> TableAltLineProps(size = 24, color = "blue")
 */
def TableAltLine = (props: TableAltLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 3C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H21ZM20 16H4V19H20V16ZM8 5H4V14H8V5ZM14 5H10V14H14V5ZM20 5H16V14H20V5Z")
  )
}
