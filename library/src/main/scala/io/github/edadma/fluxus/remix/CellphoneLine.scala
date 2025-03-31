/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CellphoneLine icon from the Remix Icon library, Device category.
 */
case class CellphoneLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CellphoneLine icon component.
 *
 * @example CellphoneLine <> CellphoneLineProps(size = 24, color = "blue")
 */
def CellphoneLine = (props: CellphoneLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 2H18C18.5523 2 19 2.44772 19 3V21C19 21.5523 18.5523 22 18 22H6C5.44772 22 5 21.5523 5 21V0H7V2ZM7 9H17V4H7V9ZM7 11V20H17V11H7Z")
  )
}
