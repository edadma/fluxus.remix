/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PictureInPictureFill icon from the Remix Icon library, Media category.
 */
case class PictureInPictureFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PictureInPictureFill icon component.
 *
 * @example PictureInPictureFill <> PictureInPictureFillProps(size = 24, color = "blue")
 */
def PictureInPictureFill = (props: PictureInPictureFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 3C21.5523 3 22 3.44772 22 4V11H20V5H4V19H10V21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H21ZM21 13C21.5523 13 22 13.4477 22 14V20C22 20.5523 21.5523 21 21 21H13C12.4477 21 12 20.5523 12 20V14C12 13.4477 12.4477 13 13 13H21Z")
  )
}
