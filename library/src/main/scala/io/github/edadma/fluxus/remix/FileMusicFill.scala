/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FileMusicFill icon from the Remix Icon library, Document category.
 */
case class FileMusicFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FileMusicFill icon component.
 *
 * @example FileMusicFill <> FileMusicFillProps(size = 24, color = "blue")
 */
def FileMusicFill = (props: FileMusicFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 2L21 7V21.0082C21 21.556 20.5551 22 20.0066 22H3.9934C3.44476 22 3 21.5447 3 21.0082V2.9918C3 2.44405 3.44495 2 3.9934 2H16ZM11 12.05C10.8384 12.0172 10.6712 12 10.5 12C9.11929 12 8 13.1193 8 14.5C8 15.8807 9.11929 17 10.5 17C11.8807 17 13 15.8807 13 14.5V10H16V8H11V12.05Z")
  )
}
