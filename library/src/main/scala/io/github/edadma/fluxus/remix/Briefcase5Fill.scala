/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Briefcase5Fill icon from the Remix Icon library, Business category.
 */
case class Briefcase5FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Briefcase5Fill icon component.
 *
 * @example Briefcase5Fill <> Briefcase5FillProps(size = 24, color = "blue")
 */
def Briefcase5Fill = (props: Briefcase5FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 5V2C7 1.44772 7.44772 1 8 1H16C16.5523 1 17 1.44772 17 2V5H21C21.5523 5 22 5.44772 22 6V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V6C2 5.44772 2.44772 5 3 5H7ZM6 13V7H4V13H6ZM8 7V13H11V11H13V13H16V7H8ZM18 13H20V7H18V13ZM9 3V5H15V3H9Z")
  )
}
