/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * UserHeartFill icon from the Remix Icon library, User & Faces category.
 */
case class UserHeartFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * UserHeartFill icon component.
 *
 * @example UserHeartFill <> UserHeartFillProps(size = 24, color = "blue")
 */
def UserHeartFill = (props: UserHeartFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17.841 15.659L18.017 15.836L18.1945 15.659C19.0732 14.7803 20.4978 14.7803 21.3765 15.659C22.2552 16.5377 22.2552 17.9623 21.3765 18.841L18.0178 22.1997L14.659 18.841C13.7803 17.9623 13.7803 16.5377 14.659 15.659C15.5377 14.7803 16.9623 14.7803 17.841 15.659ZM12 14V22H4C4 17.6651 7.44784 14.1355 11.7508 14.0038L12 14ZM12 1C15.315 1 18 3.685 18 7C18 10.315 15.315 13 12 13C8.685 13 6 10.315 6 7C6 3.685 8.685 1 12 1Z")
  )
}
