/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MobileDownloadFill icon from the Remix Icon library, Device category.
 */
case class MobileDownloadFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MobileDownloadFill icon component.
 *
 * @example MobileDownloadFill <> MobileDownloadFillProps(size = 24, color = "blue")
 */
def MobileDownloadFill = (props: MobileDownloadFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 6C12 4.46329 12.5777 3.06151 13.5278 2H6C5.44772 2 5 2.44772 5 3V21C5 21.5523 5.44772 22 6 22H18C18.5523 22 19 21.5523 19 21V11.917C18.6748 11.9716 18.3407 12 18 12C14.6863 12 12 9.31371 12 6ZM12 17C12.5523 17 13 17.4477 13 18C13 18.5523 12.5523 19 12 19C11.4477 19 11 18.5523 11 18C11 17.4477 11.4477 17 12 17ZM22 6H19V2H17V6H14L18 10L22 6Z")
  )
}
