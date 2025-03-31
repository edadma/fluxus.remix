/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArchiveStackLine icon from the Remix Icon library, Business category.
 */
case class ArchiveStackLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArchiveStackLine icon component.
 *
 * @example ArchiveStackLine <> ArchiveStackLineProps(size = 24, color = "blue")
 */
def ArchiveStackLine = (props: ArchiveStackLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 5H20V3H4V5ZM20 9H4V7H20V9ZM3 11H10V13H14V11H21V20C21 20.5523 20.5523 21 20 21H4C3.44772 21 3 20.5523 3 20V11ZM16 13V15H8V13H5V19H19V13H16Z")
  )
}
