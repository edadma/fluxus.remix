/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * File4Line icon from the Remix Icon library, Document category.
 */
case class File4LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * File4Line icon component.
 *
 * @example File4Line <> File4LineProps(size = 24, color = "blue")
 */
def File4Line = (props: File4LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 16L14.9968 22H4C3.44772 22 3 21.5523 3 21V3C3 2.44772 3.44772 2 4 2H20C20.5523 2 21 2.44772 21 3V16ZM19 15V4H5V20H14V15H19Z")
  )
}
