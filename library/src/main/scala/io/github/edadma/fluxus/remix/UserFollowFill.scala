/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * UserFollowFill icon from the Remix Icon library, User & Faces category.
 */
case class UserFollowFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * UserFollowFill icon component.
 *
 * @example UserFollowFill <> UserFollowFillProps(size = 24, color = "blue")
 */
def UserFollowFill = (props: UserFollowFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 14.0619V22H4C4 17.5817 7.58172 14 12 14C12.3387 14 12.6724 14.021 13 14.0619ZM12 13C8.685 13 6 10.315 6 7C6 3.685 8.685 1 12 1C15.315 1 18 3.685 18 7C18 10.315 15.315 13 12 13ZM17.7929 19.9142L21.3284 16.3787L22.7426 17.7929L17.7929 22.7426L14.2574 19.2071L15.6716 17.7929L17.7929 19.9142Z")
  )
}
