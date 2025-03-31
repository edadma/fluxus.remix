/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SignalWifiFill icon from the Remix Icon library, Device category.
 */
case class SignalWifiFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SignalWifiFill icon component.
 *
 * @example SignalWifiFill <> SignalWifiFillProps(size = 24, color = "blue")
 */
def SignalWifiFill = (props: SignalWifiFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.0005 3C16.2849 3 20.2196 4.49683 23.3104 6.99607L12.0005 21L0.689941 6.99671C3.78078 4.49709 7.71583 3 12.0005 3Z")
  )
}
