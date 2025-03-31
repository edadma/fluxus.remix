/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ServiceBellFill icon from the Remix Icon library, Others category.
 */
case class ServiceBellFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ServiceBellFill icon component.
 *
 * @example ServiceBellFill <> ServiceBellFillProps(size = 24, color = "blue")
 */
def ServiceBellFill = (props: ServiceBellFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15 3V5H13V6.04938C18.0533 6.5511 22 10.8147 22 16H2C2 10.8147 5.94668 6.5511 11 6.04938V5H9V3H15ZM23 20V18H1V20H23Z")
  )
}
