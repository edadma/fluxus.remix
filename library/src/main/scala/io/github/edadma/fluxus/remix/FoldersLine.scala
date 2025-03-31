/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FoldersLine icon from the Remix Icon library, Document category.
 */
case class FoldersLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FoldersLine icon component.
 *
 * @example FoldersLine <> FoldersLineProps(size = 24, color = "blue")
 */
def FoldersLine = (props: FoldersLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6 7V4C6 3.44772 6.44772 3 7 3H13.4142L15.4142 5H21C21.5523 5 22 5.44772 22 6V16C22 16.5523 21.5523 17 21 17H18V20C18 20.5523 17.5523 21 17 21H3C2.44772 21 2 20.5523 2 20V8C2 7.44772 2.44772 7 3 7H6ZM6 9H4V19H16V17H6V9ZM8 5V15H20V7H14.5858L12.5858 5H8Z")
  )
}
