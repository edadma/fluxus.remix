/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FolderHistoryFill icon from the Remix Icon library, Document category.
 */
case class FolderHistoryFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FolderHistoryFill icon component.
 *
 * @example FolderHistoryFill <> FolderHistoryFillProps(size = 24, color = "blue")
 */
def FolderHistoryFill = (props: FolderHistoryFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10.4142 3L12.4142 5H21C21.5523 5 22 5.44772 22 6V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H10.4142ZM13 9H11V15H16V13H13V9Z")
  )
}
