/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DownloadFill icon from the Remix Icon library, System category.
 */
case class DownloadFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DownloadFill icon component.
 *
 * @example DownloadFill <> DownloadFillProps(size = 24, color = "blue")
 */
def DownloadFill = (props: DownloadFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 19H21V21H3V19ZM13 9H20L12 17L4 9H11V1H13V9Z")
  )
}
