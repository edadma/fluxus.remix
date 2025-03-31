/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * EthFill icon from the Remix Icon library, Finance category.
 */
case class EthFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * EthFill icon component.
 *
 * @example EthFill <> EthFillProps(size = 24, color = "blue")
 */
def EthFill = (props: EthFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11.9999 0 4.62988 12.2201 11.9999 16.5743 19.3699 12.2201 11.9999 0ZM11.9999 24 4.62988 13.6172 11.9999 18 19.3699 13.6172 11.9999 24Z")
  )
}
