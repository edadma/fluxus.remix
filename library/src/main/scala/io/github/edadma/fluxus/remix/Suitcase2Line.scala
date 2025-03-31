/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Suitcase2Line icon from the Remix Icon library, Map category.
 */
case class Suitcase2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Suitcase2Line icon component.
 *
 * @example Suitcase2Line <> Suitcase2LineProps(size = 24, color = "blue")
 */
def Suitcase2Line = (props: Suitcase2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18 23H16V22H8V23H6V22H5C3.89543 22 3 21.1046 3 20V7C3 5.89543 3.89543 5 5 5H8V3C8 2.44772 8.44772 2 9 2H15C15.5523 2 16 2.44772 16 3V5H19C20.1046 5 21 5.89543 21 7V20C21 21.1046 20.1046 22 19 22H18V23ZM19 7H5V20H19V7ZM10 9V18H8V9H10ZM16 9V18H14V9H16ZM14 4H10V5H14V4Z")
  )
}
