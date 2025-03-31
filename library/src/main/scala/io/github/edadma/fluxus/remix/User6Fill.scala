/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * User6Fill icon from the Remix Icon library, User & Faces category.
 */
case class User6FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * User6Fill icon component.
 *
 * @example User6Fill <> User6FillProps(size = 24, color = "blue")
 */
def User6Fill = (props: User6FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11.9999 17C15.6623 17 18.8649 18.5751 20.607 20.9247L18.765 21.796C17.3473 20.1157 14.8473 19 11.9999 19C9.15248 19 6.65252 20.1157 5.23479 21.796L3.39355 20.9238C5.13576 18.5747 8.33796 17 11.9999 17ZM11.9999 2C14.7613 2 16.9999 4.23858 16.9999 7V10C16.9999 12.7614 14.7613 15 11.9999 15C9.23847 15 6.9999 12.7614 6.9999 10V7C6.9999 4.23858 9.23847 2 11.9999 2Z")
  )
}
