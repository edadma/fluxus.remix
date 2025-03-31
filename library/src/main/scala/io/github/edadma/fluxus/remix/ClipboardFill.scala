/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ClipboardFill icon from the Remix Icon library, Document category.
 */
case class ClipboardFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ClipboardFill icon component.
 *
 * @example ClipboardFill <> ClipboardFillProps(size = 24, color = "blue")
 */
def ClipboardFill = (props: ClipboardFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6 4V8H18V4H20.0066C20.5552 4 21 4.44495 21 4.9934V21.0066C21 21.5552 20.5551 22 20.0066 22H3.9934C3.44476 22 3 21.5551 3 21.0066V4.9934C3 4.44476 3.44495 4 3.9934 4H6ZM8 2H16V6H8V2Z")
  )
}
