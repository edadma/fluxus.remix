/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * User4Fill icon from the Remix Icon library, User & Faces category.
 */
case class User4FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * User4Fill icon component.
 *
 * @example User4Fill <> User4FillProps(size = 24, color = "blue")
 */
def User4Fill = (props: User4FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5 20H19V22H5V20ZM12 18C7.58172 18 4 14.4183 4 10C4 5.58172 7.58172 2 12 2C16.4183 2 20 5.58172 20 10C20 14.4183 16.4183 18 12 18Z")
  )
}
