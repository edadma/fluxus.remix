/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FolderAddFill icon from the Remix Icon library, Document category.
 */
case class FolderAddFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FolderAddFill icon component.
 *
 * @example FolderAddFill <> FolderAddFillProps(size = 24, color = "blue")
 */
def FolderAddFill = (props: FolderAddFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.4142 5H21C21.5523 5 22 5.44772 22 6V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H10.4142L12.4142 5ZM11 12H8V14H11V17H13V14H16V12H13V9H11V12Z")
  )
}
