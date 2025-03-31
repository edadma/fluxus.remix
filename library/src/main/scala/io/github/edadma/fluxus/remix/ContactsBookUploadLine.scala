/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ContactsBookUploadLine icon from the Remix Icon library, Document category.
 */
case class ContactsBookUploadLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ContactsBookUploadLine icon component.
 *
 * @example ContactsBookUploadLine <> ContactsBookUploadLineProps(size = 24, color = "blue")
 */
def ContactsBookUploadLine = (props: ContactsBookUploadLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19.0049 2C20.1068 2 21 2.89821 21 3.9908V20.0092C21 21.1087 20.1074 22 19.0049 22H3V2H19.0049ZM7 4H5V20H7V4ZM19 4H9V20H19V4ZM14 8L18 12H15V16H13V12H10L14 8ZM24 12V16H22V12H24ZM24 6V10H22V6H24Z")
  )
}
