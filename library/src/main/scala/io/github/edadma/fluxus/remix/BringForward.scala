/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BringForward icon from the Remix Icon library, Editor category.
 */
case class BringForwardProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BringForward icon component.
 *
 * @example BringForward <> BringForwardProps(size = 24, color = "blue")
 */
def BringForward = (props: BringForwardProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14 3C14.5523 3 15 3.44772 15 4V9H20C20.5523 9 21 9.44772 21 10V20C21 20.5523 20.5523 21 20 21H10C9.44772 21 9 20.5523 9 20V15H4C3.44772 15 3 14.5523 3 14V4C3 3.44772 3.44772 3 4 3H14ZM13 5H5V13H13V5Z")
  )
}
