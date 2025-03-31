/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FolderUnknowLine icon from the Remix Icon library, Document category.
 */
case class FolderUnknowLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FolderUnknowLine icon component.
 *
 * @example FolderUnknowLine <> FolderUnknowLineProps(size = 24, color = "blue")
 */
def FolderUnknowLine = (props: FolderUnknowLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.4142 5H21C21.5523 5 22 5.44772 22 6V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H10.4142L12.4142 5ZM4 5V19H20V7H11.5858L9.58579 5H4ZM11 16H13V18H11V16ZM8.56731 10.8135C8.88637 9.20919 10.302 8 12 8C13.933 8 15.5 9.567 15.5 11.5C15.5 13.433 13.933 15 12 15H11V13H12C12.8284 13 13.5 12.3284 13.5 11.5C13.5 10.6716 12.8284 10 12 10C11.2723 10 10.6656 10.5182 10.5288 11.2058L8.56731 10.8135Z")
  )
}
