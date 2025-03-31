/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ContactsBookLine icon from the Remix Icon library, Document category.
 */
case class ContactsBookLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ContactsBookLine icon component.
 *
 * @example ContactsBookLine <> ContactsBookLineProps(size = 24, color = "blue")
 */
def ContactsBookLine = (props: ContactsBookLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 2H19.0049C20.1068 2 21 2.89821 21 3.9908V20.0092C21 21.1087 20.1074 22 19.0049 22H3V2ZM7 4H5V20H7V4ZM9 20H19V4H9V20ZM11 16C11 14.3431 12.3431 13 14 13C15.6569 13 17 14.3431 17 16H11ZM14 12C12.8954 12 12 11.1046 12 10C12 8.89543 12.8954 8 14 8C15.1046 8 16 8.89543 16 10C16 11.1046 15.1046 12 14 12ZM22 6H24V10H22V6ZM22 12H24V16H22V12Z")
  )
}
