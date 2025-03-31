/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FileMarkedLine icon from the Remix Icon library, Document category.
 */
case class FileMarkedLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FileMarkedLine icon component.
 *
 * @example FileMarkedLine <> FileMarkedLineProps(size = 24, color = "blue")
 */
def FileMarkedLine = (props: FileMarkedLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 22H4C3.44772 22 3 21.5523 3 21V3C3 2.44772 3.44772 2 4 2H20C20.5523 2 21 2.44772 21 3V21C21 21.5523 20.5523 22 20 22ZM7 4H5V20H19V4H14V13L10.5 11L7 13V4Z")
  )
}
