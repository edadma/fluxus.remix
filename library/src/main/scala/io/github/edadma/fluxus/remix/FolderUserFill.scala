/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FolderUserFill icon from the Remix Icon library, Document category.
 */
case class FolderUserFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FolderUserFill icon component.
 *
 * @example FolderUserFill <> FolderUserFillProps(size = 24, color = "blue")
 */
def FolderUserFill = (props: FolderUserFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.4142 5H21C21.5523 5 22 5.44772 22 6V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H10.4142L12.4142 5ZM12 13C13.3807 13 14.5 11.8807 14.5 10.5C14.5 9.11929 13.3807 8 12 8C10.6193 8 9.5 9.11929 9.5 10.5C9.5 11.8807 10.6193 13 12 13ZM8 18H16C16 15.7909 14.2091 14 12 14C9.79086 14 8 15.7909 8 18Z")
  )
}
