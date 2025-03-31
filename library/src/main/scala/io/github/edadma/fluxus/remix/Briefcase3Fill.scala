/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Briefcase3Fill icon from the Remix Icon library, Business category.
 */
case class Briefcase3FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Briefcase3Fill icon component.
 *
 * @example Briefcase3Fill <> Briefcase3FillProps(size = 24, color = "blue")
 */
def Briefcase3Fill = (props: Briefcase3FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 5V2C7 1.44772 7.44772 1 8 1H16C16.5523 1 17 1.44772 17 2V5H21C21.5523 5 22 5.44772 22 6V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V6C2 5.44772 2.44772 5 3 5H7ZM17 7V12H20V7H17ZM15 7H9V12H15V7ZM7 7H4V12H7V7ZM9 3V5H15V3H9Z")
  )
}
