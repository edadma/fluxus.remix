/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Folder6Line icon from the Remix Icon library, Document category.
 */
case class Folder6LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Folder6Line icon component.
 *
 * @example Folder6Line <> Folder6LineProps(size = 24, color = "blue")
 */
def Folder6Line = (props: Folder6LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 4C2 3.44772 2.44772 3 3 3H10.4142L12.4142 5H21C21.5523 5 22 5.44772 22 6V20C22 20.5523 21.5523 21 21 21L3 21C2.45 21 2 20.55 2 20V4ZM10.5858 6L9.58579 5H4V7H9.58579L10.5858 6ZM4 9V19L20 19V7H12.4142L10.4142 9H4Z")
  )
}
