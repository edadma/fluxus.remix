/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BreadLine icon from the Remix Icon library, Food category.
 */
case class BreadLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BreadLine icon component.
 *
 * @example BreadLine <> BreadLineProps(size = 24, color = "blue")
 */
def BreadLine = (props: BreadLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5 3C2.79086 3 1 4.79086 1 7C1 8.48168 1.8052 9.77343 3 10.4646V19C3 20.6569 4.34315 22 6 22H18C19.6569 22 21 20.6569 21 19V10.4646C22.1948 9.77343 23 8.48168 23 7C23 4.79086 21.2091 3 19 3H5ZM7 20C6.44772 20 6 19.5523 6 19V9.12212L5.33325 8.88645C4.5551 8.61142 4 7.86925 4 7C4 5.89543 4.89543 5 6 5H19C20.1046 5 21 5.89543 21 7C21 7.86925 20.4449 8.61142 19.6668 8.88645L19 9.12212V19C19 19.5523 18.5523 20 18 20H7Z")
  )
}
