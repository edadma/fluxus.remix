/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Spam2Line icon from the Remix Icon library, System category.
 */
case class Spam2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Spam2Line icon component.
 *
 * @example Spam2Line <> Spam2LineProps(size = 24, color = "blue")
 */
def Spam2Line = (props: Spam2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.936 2.50098L21.501 8.06595V15.936L15.936 21.501H8.06595L2.50098 15.936V8.06595L8.06595 2.50098H15.936ZM15.1076 4.50098H8.89437L4.50098 8.89437V15.1076L8.89437 19.501H15.1076L19.501 15.1076V8.89437L15.1076 4.50098ZM11.0002 15.0002H13.0002V17.0002H11.0002V15.0002ZM11.0002 7.00024H13.0002V13.0002H11.0002V7.00024Z")
  )
}
