/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DeleteBin4Fill icon from the Remix Icon library, System category.
 */
case class DeleteBin4FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DeleteBin4Fill icon component.
 *
 * @example DeleteBin4Fill <> DeleteBin4FillProps(size = 24, color = "blue")
 */
def DeleteBin4Fill = (props: DeleteBin4FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 7V21C20 21.5523 19.5523 22 19 22H5C4.44772 22 4 21.5523 4 21V7H2V5H22V7H20ZM11 10V17H13V10H11ZM7 2H17V4H7V2Z")
  )
}
