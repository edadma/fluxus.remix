/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SendToBack icon from the Remix Icon library, Editor category.
 */
case class SendToBackProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SendToBack icon component.
 *
 * @example SendToBack <> SendToBackProps(size = 24, color = "blue")
 */
def SendToBack = (props: SendToBackProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 3C11.5523 3 12 3.44772 12 4V6H17C17.5523 6 18 6.44772 18 7V12H20C20.5523 12 21 12.4477 21 13V20C21 20.5523 20.5523 21 20 21H13C12.4477 21 12 20.5523 12 20V18H7C6.44772 18 6 17.5523 6 17V12H4C3.44772 12 3 11.5523 3 11V4C3 3.44772 3.44772 3 4 3H11ZM16 8H12V11C12 11.5523 11.5523 12 11 12H8V16H12V13C12 12.4477 12.4477 12 13 12H16V8Z")
  )
}
