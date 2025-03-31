/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * AccountBox2Fill icon from the Remix Icon library, User & Faces category.
 */
case class AccountBox2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * AccountBox2Fill icon component.
 *
 * @example AccountBox2Fill <> AccountBox2FillProps(size = 24, color = "blue")
 */
def AccountBox2Fill = (props: AccountBox2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 4.99509C3 3.89323 3.89262 3 4.99509 3H19.0049C20.1068 3 21 3.89262 21 4.99509V19.0049C21 20.1068 20.1074 21 19.0049 21H4.99509C3.89323 21 3 20.1074 3 19.0049V4.99509ZM12 8C12.5523 8 13 8.44772 13 9C13 9.55228 12.5523 10 12 10C11.4477 10 11 9.55228 11 9C11 8.44772 11.4477 8 12 8ZM12 12C13.6569 12 15 10.6569 15 9C15 7.34315 13.6569 6 12 6C10.3431 6 9 7.34315 9 9C9 10.6569 10.3431 12 12 12ZM12 15C13.1046 15 14 15.8954 14 17H16C16 14.7909 14.2091 13 12 13C9.79086 13 8 14.7909 8 17H10C10 15.8954 10.8954 15 12 15Z")
  )
}
