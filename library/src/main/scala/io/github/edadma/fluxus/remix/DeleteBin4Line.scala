/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DeleteBin4Line icon from the Remix Icon library, System category.
 */
case class DeleteBin4LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DeleteBin4Line icon component.
 *
 * @example DeleteBin4Line <> DeleteBin4LineProps(size = 24, color = "blue")
 */
def DeleteBin4Line = (props: DeleteBin4LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 7V21C20 21.5523 19.5523 22 19 22H5C4.44772 22 4 21.5523 4 21V7H2V5H22V7H20ZM6 7V20H18V7H6ZM7 2H17V4H7V2ZM11 10H13V17H11V10Z")
  )
}
