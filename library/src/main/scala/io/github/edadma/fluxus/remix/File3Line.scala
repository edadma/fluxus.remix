/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * File3Line icon from the Remix Icon library, Document category.
 */
case class File3LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * File3Line icon component.
 *
 * @example File3Line <> File3LineProps(size = 24, color = "blue")
 */
def File3Line = (props: File3LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 8V20.9932C21 21.5501 20.5552 22 20.0066 22H3.9934C3.44495 22 3 21.556 3 21.0082V2.9918C3 2.45531 3.4487 2 4.00221 2H14.9968L21 8ZM19 9H14V4H5V20H19V9Z")
  )
}
