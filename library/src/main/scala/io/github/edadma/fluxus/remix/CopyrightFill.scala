/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CopyrightFill icon from the Remix Icon library, Business category.
 */
case class CopyrightFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CopyrightFill icon component.
 *
 * @example CopyrightFill <> CopyrightFillProps(size = 24, color = "blue")
 */
def CopyrightFill = (props: CopyrightFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 2C17.52 2 22 6.48 22 12C22 17.52 17.52 22 12 22C6.48 22 2 17.52 2 12C2 6.48 6.48 2 12 2ZM12 7C9.24 7 7 9.24 7 12C7 14.76 9.24 17 12 17C13.8195 17 15.413 16.0265 16.2878 14.5723L14.5729 13.5442C14.0484 14.4166 13.0926 15 12 15C10.3425 15 9 13.6575 9 12C9 10.3425 10.3425 9 12 9C13.0931 9 14.0491 9.58383 14.5735 10.4568L16.2878 9.42771C15.413 7.9735 13.8195 7 12 7Z")
  )
}
