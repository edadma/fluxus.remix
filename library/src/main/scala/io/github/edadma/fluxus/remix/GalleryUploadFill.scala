/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * GalleryUploadFill icon from the Remix Icon library, Media category.
 */
case class GalleryUploadFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * GalleryUploadFill icon component.
 *
 * @example GalleryUploadFill <> GalleryUploadFillProps(size = 24, color = "blue")
 */
def GalleryUploadFill = (props: GalleryUploadFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8 1V3H16V1H18V3H21.0082C21.556 3 22 3.44495 22 3.9934V20.0066C22 20.5552 21.5447 21 21.0082 21H2.9918C2.44405 21 2 20.5551 2 20.0066V3.9934C2 3.44476 2.45531 3 2.9918 3H6V1H8ZM12 8L8 12H11V16H13V12H16L12 8Z")
  )
}
