/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExportLine icon from the Remix Icon library, System category.
 */
case class ExportLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExportLine icon component.
 *
 * @example ExportLine <> ExportLineProps(size = 24, color = "blue")
 */
def ExportLine = (props: ExportLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22 4C22 3.44772 21.5523 3 21 3H3C2.44772 3 2 3.44772 2 4V20C2 20.5523 2.44772 21 3 21H21C21.5523 21 22 20.5523 22 20V4ZM4 15H7.41604C8.1876 16.7659 9.94968 18 12 18C14.0503 18 15.8124 16.7659 16.584 15H20V19H4V15ZM4 5H20V13H15C15 14.6569 13.6569 16 12 16C10.3431 16 9 14.6569 9 13H4V5ZM16 11H13V14H11V11H8L12 6.5L16 11Z")
  )
}
