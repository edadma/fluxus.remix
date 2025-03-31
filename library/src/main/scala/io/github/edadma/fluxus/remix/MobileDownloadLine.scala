/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MobileDownloadLine icon from the Remix Icon library, Device category.
 */
case class MobileDownloadLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MobileDownloadLine icon component.
 *
 * @example MobileDownloadLine <> MobileDownloadLineProps(size = 24, color = "blue")
 */
def MobileDownloadLine = (props: MobileDownloadLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 4V20H17V12H19V21C19 21.5523 18.5523 22 18 22H6C5.44772 22 5 21.5523 5 21V3C5 2.44772 5.44772 2 6 2H13V4H7ZM19 6H22L18 10L14 6H17V2H19V6ZM13 18C13 18.5523 12.5523 19 12 19C11.4477 19 11 18.5523 11 18C11 17.4477 11.4477 17 12 17C12.5523 17 13 17.4477 13 18Z")
  )
}
