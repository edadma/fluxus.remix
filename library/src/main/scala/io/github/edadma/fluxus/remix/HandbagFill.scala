/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * HandbagFill icon from the Remix Icon library, Others category.
 */
case class HandbagFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * HandbagFill icon component.
 *
 * @example HandbagFill <> HandbagFillProps(size = 24, color = "blue")
 */
def HandbagFill = (props: HandbagFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.0002 2C15.8662 2 19.0002 5.13401 19.0002 9H20.0742C20.5967 9 21.0311 9.40231 21.0712 9.9233L21.9174 20.9233C21.9597 21.474 21.5477 21.9547 20.997 21.9971L20.9203 22H3.08008C2.52779 22 2.08008 21.5523 2.08008 21L2.08302 20.9233L2.92918 9.9233C2.96925 9.40231 3.4037 9 3.92623 9H5.0002C5.0002 5.13401 8.13421 2 12.0002 2ZM14.0002 13H10.0002V15H14.0002V13ZM12.0002 4C9.31145 4 7.11838 6.12231 7.00482 8.78311L7.0002 9H17.0002C17.0002 6.31124 14.8779 4.11818 12.2171 4.00462L12.0002 4Z")
  )
}
