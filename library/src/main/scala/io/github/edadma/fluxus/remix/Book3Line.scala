/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Book3Line icon from the Remix Icon library, Document category.
 */
case class Book3LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Book3Line icon component.
 *
 * @example Book3Line <> Book3LineProps(size = 24, color = "blue")
 */
def Book3Line = (props: Book3LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 4H7C5.89543 4 5 4.89543 5 6C5 7.10457 5.89543 8 7 8H21V21C21 21.5523 20.5523 22 20 22H7C4.79086 22 3 20.2091 3 18V6C3 3.79086 4.79086 2 7 2H20C20.5523 2 21 2.44772 21 3V4ZM5 18C5 19.1046 5.89543 20 7 20H19V10H7C6.27143 10 5.58835 9.80521 5 9.46487V18ZM20 7H7C6.44772 7 6 6.55228 6 6C6 5.44772 6.44772 5 7 5H20V7Z")
  )
}
