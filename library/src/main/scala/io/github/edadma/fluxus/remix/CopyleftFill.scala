/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CopyleftFill icon from the Remix Icon library, Business category.
 */
case class CopyleftFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CopyleftFill icon component.
 *
 * @example CopyleftFill <> CopyleftFillProps(size = 24, color = "blue")
 */
def CopyleftFill = (props: CopyleftFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 22C6.48 22 2 17.52 2 12C2 6.48 6.48 2 12 2C17.52 2 22 6.48 22 12C22 17.52 17.52 22 12 22ZM12 17C14.76 17 17 14.76 17 12C17 9.24 14.76 7 12 7C10.1805 7 8.58698 7.9735 7.71225 9.42771L9.42709 10.4558C9.95162 9.58339 10.9074 9 12 9C13.6575 9 15 10.3425 15 12C15 13.6575 13.6575 15 12 15C10.9069 15 9.95089 14.4162 9.42649 13.5432L7.71225 14.5723C8.58698 16.0265 10.1805 17 12 17Z")
  )
}
