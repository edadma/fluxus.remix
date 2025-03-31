/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FocusMode icon from the Remix Icon library, Editor category.
 */
case class FocusModeProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FocusMode icon component.
 *
 * @example FocusMode <> FocusModeProps(size = 24, color = "blue")
 */
def FocusMode = (props: FocusModeProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 3C3.44772 3 3 3.44772 3 4V8H5V5H8V3H4ZM20 3H16V5H19V8H21V4C21 3.44772 20.5523 3 20 3ZM5 16V19H8V21H4C3.44772 21 3 20.5523 3 20V16H5ZM19 16V19H16V21H20C20.5523 21 21 20.5523 21 20V16H19ZM10 9C9.44772 9 9 9.44772 9 10V14C9 14.5523 9.44772 15 10 15H14C14.5523 15 15 14.5523 15 14V10C15 9.44772 14.5523 9 14 9H10Z")
  )
}
