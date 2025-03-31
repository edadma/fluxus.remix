/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DownloadLine icon from the Remix Icon library, System category.
 */
case class DownloadLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DownloadLine icon component.
 *
 * @example DownloadLine <> DownloadLineProps(size = 24, color = "blue")
 */
def DownloadLine = (props: DownloadLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 19H21V21H3V19ZM13 13.1716L19.0711 7.1005L20.4853 8.51472L12 17L3.51472 8.51472L4.92893 7.1005L11 13.1716V2H13V13.1716Z")
  )
}
