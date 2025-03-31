/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * UserReceivedFill icon from the Remix Icon library, User & Faces category.
 */
case class UserReceivedFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * UserReceivedFill icon component.
 *
 * @example UserReceivedFill <> UserReceivedFillProps(size = 24, color = "blue")
 */
def UserReceivedFill = (props: UserReceivedFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14 14.252V22H4C4 17.5817 7.58172 14 12 14C12.6906 14 13.3608 14.0875 14 14.252ZM12 13C8.685 13 6 10.315 6 7C6 3.685 8.685 1 12 1C15.315 1 18 3.685 18 7C18 10.315 15.315 13 12 13ZM19.4184 17H23.0042V19H19.4184L21.2469 20.8284L19.8326 22.2426L15.59 18L19.8326 13.7574L21.2469 15.1716L19.4184 17Z")
  )
}
