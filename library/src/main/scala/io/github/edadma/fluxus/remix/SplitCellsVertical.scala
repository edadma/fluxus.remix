/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SplitCellsVertical icon from the Remix Icon library, Editor category.
 */
case class SplitCellsVerticalProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SplitCellsVertical icon component.
 *
 * @example SplitCellsVertical <> SplitCellsVerticalProps(size = 24, color = "blue")
 */
def SplitCellsVertical = (props: SplitCellsVerticalProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 3C20.5523 3 21 3.44772 21 4V20C21 20.5523 20.5523 21 20 21H4C3.44772 21 3 20.5523 3 20V4C3 3.44772 3.44772 3 4 3H20ZM19 5H5V10.999L9 11V13H5V19H19V13H15V11L19 10.999V5ZM12 6L15 9H13V15H15L12 18L9 15H11V9H9L12 6Z")
  )
}
