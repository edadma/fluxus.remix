/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DeleteBin6Fill icon from the Remix Icon library, System category.
 */
case class DeleteBin6FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DeleteBin6Fill icon component.
 *
 * @example DeleteBin6Fill <> DeleteBin6FillProps(size = 24, color = "blue")
 */
def DeleteBin6Fill = (props: DeleteBin6FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 4H22V6H20V21C20 21.5523 19.5523 22 19 22H5C4.44772 22 4 21.5523 4 21V6H2V4H7V2H17V4ZM9 9V17H11V9H9ZM13 9V17H15V9H13Z")
  )
}
