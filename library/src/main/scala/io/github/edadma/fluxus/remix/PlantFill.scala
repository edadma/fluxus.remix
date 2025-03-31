/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PlantFill icon from the Remix Icon library, Others category.
 */
case class PlantFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PlantFill icon component.
 *
 * @example PlantFill <> PlantFillProps(size = 24, color = "blue")
 */
def PlantFill = (props: PlantFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20.998 3V5C20.998 8.86599 17.864 12 13.998 12H12.998V13H17.998V20C17.998 21.1046 17.1026 22 15.998 22H7.99805C6.89348 22 5.99805 21.1046 5.99805 20V13H10.998V10C10.998 6.13401 14.1321 3 17.998 3H20.998ZM5.49805 2C8.02667 2 10.263 3.25136 11.6216 5.1686C10.6026 6.51084 9.99805 8.18482 9.99805 10V11H9.49805C5.35591 11 1.99805 7.64214 1.99805 3.5V2H5.49805Z")
  )
}
