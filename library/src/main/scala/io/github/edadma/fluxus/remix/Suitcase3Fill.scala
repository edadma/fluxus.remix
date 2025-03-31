/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Suitcase3Fill icon from the Remix Icon library, Map category.
 */
case class Suitcase3FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Suitcase3Fill icon component.
 *
 * @example Suitcase3Fill <> Suitcase3FillProps(size = 24, color = "blue")
 */
def Suitcase3Fill = (props: Suitcase3FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15 1C15.5523 1 16 1.44772 16 2V7H17V6H19V7H20C20.5523 7 21 7.44772 21 8V20C21 20.5523 20.5523 21 20 21H19V22H17V21H7V22H5V21H4C3.44772 21 3 20.5523 3 20V8C3 7.44772 3.44772 7 4 7H5V6H7V7H8V2C8 1.44772 8.44772 1 9 1H15ZM9 10H7V18H9V10ZM13 10H11V18H13V10ZM17 10H15V18H17V10ZM14 3H10V7H14V3Z")
  )
}
