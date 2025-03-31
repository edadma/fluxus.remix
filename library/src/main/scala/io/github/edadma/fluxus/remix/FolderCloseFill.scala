/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FolderCloseFill icon from the Remix Icon library, Document category.
 */
case class FolderCloseFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FolderCloseFill icon component.
 *
 * @example FolderCloseFill <> FolderCloseFillProps(size = 24, color = "blue")
 */
def FolderCloseFill = (props: FolderCloseFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19 12C20.0929 12 21.1175 12.2922 22 12.8027V6C22 5.44772 21.5523 5 21 5H12.4142L10.4142 3H3C2.44772 3 2 3.44772 2 4V20C2 20.5523 2.44772 21 3 21H13.8027C13.2922 20.1175 13 19.0929 13 18C13 14.6863 15.6863 12 19 12ZM20.4143 17.9999L22.5356 20.1212L21.1214 21.5354L19.0001 19.4141L16.8788 21.5354L15.4646 20.1212L17.5859 17.9999L15.4646 15.8786L16.8788 14.4644L19.0001 16.5857L21.1214 14.4644L22.5356 15.8786L20.4143 17.9999Z")
  )
}
