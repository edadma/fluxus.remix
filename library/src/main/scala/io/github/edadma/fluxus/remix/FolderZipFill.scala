/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FolderZipFill icon from the Remix Icon library, Document category.
 */
case class FolderZipFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FolderZipFill icon component.
 *
 * @example FolderZipFill <> FolderZipFillProps(size = 24, color = "blue")
 */
def FolderZipFill = (props: FolderZipFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 5C21.5523 5 22 5.44772 22 6V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H10.4142L12.4142 5H16V7H18V5H21ZM18 13H16V15H14V18H18V13ZM16 11H14V13H16V11ZM18 9H16V11H18V9ZM16 7H14V9H16V7Z")
  )
}
