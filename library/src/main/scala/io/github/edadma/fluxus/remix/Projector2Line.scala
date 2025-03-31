/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Projector2Line icon from the Remix Icon library, Business category.
 */
case class Projector2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Projector2Line icon component.
 *
 * @example Projector2Line <> Projector2LineProps(size = 24, color = "blue")
 */
def Projector2Line = (props: Projector2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22 19V21H20V19H4V21H2V19C1.44772 19 1 18.5523 1 18V6C1 5.44772 1.44772 5 2 5H12.5278C13.6264 3.7725 15.223 3 17 3C18.777 3 20.3736 3.7725 21.4722 5H22C22.5523 5 23 5.44772 23 6V18C23 18.5523 22.5523 19 22 19ZM11.3414 7H3V17H21V13.4722C19.9385 14.4223 18.5367 15 17 15C13.6863 15 11 12.3137 11 9C11 8.29873 11.1203 7.62556 11.3414 7ZM17 13C19.2091 13 21 11.2091 21 9C21 6.79086 19.2091 5 17 5C14.7909 5 13 6.79086 13 9C13 11.2091 14.7909 13 17 13ZM5 13H7V15H5V13ZM8 13H10V15H8V13Z")
  )
}
