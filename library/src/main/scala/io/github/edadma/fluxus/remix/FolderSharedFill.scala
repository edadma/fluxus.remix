/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FolderSharedFill icon from the Remix Icon library, Document category.
 */
case class FolderSharedFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FolderSharedFill icon component.
 *
 * @example FolderSharedFill <> FolderSharedFillProps(size = 24, color = "blue")
 */
def FolderSharedFill = (props: FolderSharedFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22 13.126C21.0149 12.4174 19.8062 12 18.5 12C15.1863 12 12.5 14.6863 12.5 18C12.5 19.0929 12.7922 20.1175 13.3027 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H10.4142L12.4142 5H21C21.5523 5 22 5.44772 22 6V13.126ZM18 17V13.5L23 18L18 22.5V19H15V17H18Z")
  )
}
