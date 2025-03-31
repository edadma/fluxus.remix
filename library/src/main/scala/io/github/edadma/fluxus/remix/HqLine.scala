/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * HqLine icon from the Remix Icon library, Media category.
 */
case class HqLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * HqLine icon component.
 *
 * @example HqLine <> HqLineProps(size = 24, color = "blue")
 */
def HqLine = (props: HqLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 5V19H20V5H4ZM3 3H21C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3ZM7.5 11.25H9.5V9H11V15H9.5V12.75H7.5V15H6V9H7.5V11.25ZM16.25 15V16.5H14.75V15H14C13.4477 15 13 14.5523 13 14V10C13 9.44772 13.4477 9 14 9H17C17.5523 9 18 9.44772 18 10V14C18 14.5523 17.5523 15 17 15H16.25ZM14.5 10.5V13.5H16.5V10.5H14.5Z")
  )
}
