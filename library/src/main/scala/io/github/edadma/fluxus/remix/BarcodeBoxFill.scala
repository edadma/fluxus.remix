/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BarcodeBoxFill icon from the Remix Icon library, Device category.
 */
case class BarcodeBoxFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BarcodeBoxFill icon component.
 *
 * @example BarcodeBoxFill <> BarcodeBoxFillProps(size = 24, color = "blue")
 */
def BarcodeBoxFill = (props: BarcodeBoxFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 3H21C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3ZM6 7V17H9V7H6ZM10 7V17H12V7H10ZM13 7V17H14V7H13ZM15 7V17H18V7H15Z")
  )
}
