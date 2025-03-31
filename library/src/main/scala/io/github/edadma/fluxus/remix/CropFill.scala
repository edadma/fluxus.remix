/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CropFill icon from the Remix Icon library, Design category.
 */
case class CropFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CropFill icon component.
 *
 * @example CropFill <> CropFillProps(size = 24, color = "blue")
 */
def CropFill = (props: CropFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19 17H22V19H19V22H17V19H6C5.44772 19 5 18.5523 5 18V7H2V5H5V2H7V5H18C18.5523 5 19 5.44772 19 6V17Z")
  )
}
