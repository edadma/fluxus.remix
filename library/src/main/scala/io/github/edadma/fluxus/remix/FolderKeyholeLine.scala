/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FolderKeyholeLine icon from the Remix Icon library, Document category.
 */
case class FolderKeyholeLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FolderKeyholeLine icon component.
 *
 * @example FolderKeyholeLine <> FolderKeyholeLineProps(size = 24, color = "blue")
 */
def FolderKeyholeLine = (props: FolderKeyholeLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10.4142 3L12.4142 5H21C21.5523 5 22 5.44772 22 6V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H10.4142ZM9.58579 5H4V19H20V7H11.5858L9.58579 5ZM12 9C13.1046 9 14 9.89543 14 11C14 11.7398 13.5983 12.3858 13.0011 12.7318L13 17H11L10.9999 12.7324C10.4022 12.3866 10 11.7403 10 11C10 9.89543 10.8954 9 12 9Z")
  )
}
