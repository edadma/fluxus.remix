/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * LockPasswordLine icon from the Remix Icon library, System category.
 */
case class LockPasswordLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * LockPasswordLine icon component.
 *
 * @example LockPasswordLine <> LockPasswordLineProps(size = 24, color = "blue")
 */
def LockPasswordLine = (props: LockPasswordLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18 8H20C20.5523 8 21 8.44772 21 9V21C21 21.5523 20.5523 22 20 22H4C3.44772 22 3 21.5523 3 21V9C3 8.44772 3.44772 8 4 8H6V7C6 3.68629 8.68629 1 12 1C15.3137 1 18 3.68629 18 7V8ZM5 10V20H19V10H5ZM11 14H13V16H11V14ZM7 14H9V16H7V14ZM15 14H17V16H15V14ZM16 8V7C16 4.79086 14.2091 3 12 3C9.79086 3 8 4.79086 8 7V8H16Z")
  )
}
