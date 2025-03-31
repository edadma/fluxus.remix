/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PlantLine icon from the Remix Icon library, Others category.
 */
case class PlantLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PlantLine icon component.
 *
 * @example PlantLine <> PlantLineProps(size = 24, color = "blue")
 */
def PlantLine = (props: PlantLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5.99805 2C8.68733 2 11.0224 3.51653 12.1947 5.74104C13.372 4.08252 15.3086 3 17.498 3H20.998V5.5C20.998 9.08985 18.0879 12 14.498 12H12.998V13H17.998V20C17.998 21.1046 17.1026 22 15.998 22H7.99805C6.89348 22 5.99805 21.1046 5.99805 20V13H10.998V11H8.99805C5.13205 11 1.99805 7.86599 1.99805 4V2H5.99805ZM15.998 15H7.99805V20H15.998V15ZM18.998 5H17.498C15.0128 5 12.998 7.01472 12.998 9.5V10H14.498C16.9833 10 18.998 7.98528 18.998 5.5V5ZM5.99805 4H3.99805C3.99805 6.76142 6.23662 9 8.99805 9H10.998C10.998 6.23858 8.75947 4 5.99805 4Z")
  )
}
