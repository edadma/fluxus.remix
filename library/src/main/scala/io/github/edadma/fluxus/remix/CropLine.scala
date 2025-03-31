/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CropLine icon from the Remix Icon library, Design category.
 */
case class CropLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CropLine icon component.
 *
 * @example CropLine <> CropLineProps(size = 24, color = "blue")
 */
def CropLine = (props: CropLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15 17V19H6C5.44772 19 5 18.5523 5 18V7H2V5H5V2H7V17H15ZM17 22V7H9V5H18C18.5523 5 19 5.44772 19 6V17H22V19H19V22H17Z")
  )
}
