/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SeedlingFill icon from the Remix Icon library, Others category.
 */
case class SeedlingFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SeedlingFill icon component.
 *
 * @example SeedlingFill <> SeedlingFillProps(size = 24, color = "blue")
 */
def SeedlingFill = (props: SeedlingFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21.998 7V9.5C21.998 13.0899 19.0879 16 15.498 16H12.998V21H10.998V14L11.0169 13.0007C11.2719 9.64413 14.0762 7 17.498 7H21.998ZM5.99805 3C9.0904 3 11.7144 5.00519 12.6408 7.78626C11.1417 9.06119 10.1516 10.9143 10.0144 13.0004L8.99805 13C5.13205 13 1.99805 9.86599 1.99805 6V3H5.99805Z")
  )
}
