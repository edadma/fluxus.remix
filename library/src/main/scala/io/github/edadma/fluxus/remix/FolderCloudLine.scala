/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FolderCloudLine icon from the Remix Icon library, Document category.
 */
case class FolderCloudLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FolderCloudLine icon component.
 *
 * @example FolderCloudLine <> FolderCloudLineProps(size = 24, color = "blue")
 */
def FolderCloudLine = (props: FolderCloudLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 3C2.44772 3 2 3.44772 2 4V20C2 20.5523 2.44772 21 3 21H10V19H4V5H9.58579L11.5858 7H20V11H22V6C22 5.44772 21.5523 5 21 5H12.4142L10.4142 3H3ZM12 18.25C12 16.9907 12.8465 15.9291 14.0015 15.6031C13.9452 13.6578 15.5523 12 17.5 12C19.4477 12 21.0548 13.6578 20.9985 15.6031C22.1535 15.9291 23 16.9907 23 18.25C23 19.7688 21.7688 21 20.25 21H14.75C13.2312 21 12 19.7688 12 18.25ZM17.5 14C16.6716 14 16 14.6716 16 15.5C16 15.9637 16.0239 16.4751 16.0569 16.9605C15.0926 17.1654 14 17.5516 14 18.25C14 18.6642 14.3358 19 14.75 19H20.25C20.6642 19 21 18.6642 21 18.25C21 17.5516 19.9074 17.1654 18.9431 16.9605C18.9761 16.4751 19 15.9637 19 15.5C19 14.6716 18.3284 14 17.5 14Z")
  )
}
