/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FolderShield2Fill icon from the Remix Icon library, Document category.
 */
case class FolderShield2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FolderShield2Fill icon component.
 *
 * @example FolderShield2Fill <> FolderShield2FillProps(size = 24, color = "blue")
 */
def FolderShield2Fill = (props: FolderShield2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22 10H12V17.3823C12 18.7906 12.6315 20.1159 13.7054 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H10.4142L12.4142 5H21C21.5523 5 22 5.44772 22 6V10ZM14 12H22V17.3823C22 18.2786 21.5544 19.1156 20.8125 19.6128L18 21.4978L15.1875 19.6128C14.4456 19.1156 14 18.2786 14 17.3823V12Z")
  )
}
