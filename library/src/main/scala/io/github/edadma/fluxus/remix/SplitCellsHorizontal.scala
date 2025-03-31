/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SplitCellsHorizontal icon from the Remix Icon library, Editor category.
 */
case class SplitCellsHorizontalProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SplitCellsHorizontal icon component.
 *
 * @example SplitCellsHorizontal <> SplitCellsHorizontalProps(size = 24, color = "blue")
 */
def SplitCellsHorizontal = (props: SplitCellsHorizontalProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 3C20.5523 3 21 3.44772 21 4V20C21 20.5523 20.5523 21 20 21H4C3.44772 21 3 20.5523 3 20V4C3 3.44772 3.44772 3 4 3H20ZM11 5H5V19H11V15H13V19H19V5H13V9H11V5ZM15 9L18 12L15 15V13H9V15L6 12L9 9V11H15V9Z")
  )
}
