/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ContactsBookUploadFill icon from the Remix Icon library, Document category.
 */
case class ContactsBookUploadFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ContactsBookUploadFill icon component.
 *
 * @example ContactsBookUploadFill <> ContactsBookUploadFillProps(size = 24, color = "blue")
 */
def ContactsBookUploadFill = (props: ContactsBookUploadFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 2V22H3V2H7ZM19.0049 2C20.1068 2 21 2.89821 21 3.9908V20.0092C21 21.1087 20.1074 22 19.0049 22H9V2H19.0049ZM15 8L11 12H14V16H16V12H19L15 8ZM24 12V16H22V12H24ZM24 6V10H22V6H24Z")
  )
}
