/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ChatVoiceFill icon from the Remix Icon library, Communication category.
 */
case class ChatVoiceFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ChatVoiceFill icon component.
 *
 * @example ChatVoiceFill <> ChatVoiceFillProps(size = 24, color = "blue")
 */
def ChatVoiceFill = (props: ChatVoiceFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.92893 19.0711C3.11929 17.2614 2 14.7614 2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22H2L4.92893 19.0711ZM11 6V18H13V6H11ZM7 9V15H9V9H7ZM15 9V15H17V9H15Z")
  )
}
