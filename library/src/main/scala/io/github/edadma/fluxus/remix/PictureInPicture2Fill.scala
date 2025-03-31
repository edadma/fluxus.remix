/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PictureInPicture2Fill icon from the Remix Icon library, Media category.
 */
case class PictureInPicture2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PictureInPicture2Fill icon component.
 *
 * @example PictureInPicture2Fill <> PictureInPicture2FillProps(size = 24, color = "blue")
 */
def PictureInPicture2Fill = (props: PictureInPicture2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 3C21.5523 3 22 3.44772 22 4V11H20V5H4V19H10V21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H21ZM21 13C21.5523 13 22 13.4477 22 14V20C22 20.5523 21.5523 21 21 21H13C12.4477 21 12 20.5523 12 20V14C12 13.4477 12.4477 13 13 13H21ZM6.70711 6.29289L8.95689 8.54289L11 6.5V12H5.5L7.54289 9.95689L5.29289 7.70711L6.70711 6.29289Z")
  )
}
