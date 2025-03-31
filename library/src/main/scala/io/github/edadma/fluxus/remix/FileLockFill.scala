/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FileLockFill icon from the Remix Icon library, Document category.
 */
case class FileLockFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FileLockFill icon component.
 *
 * @example FileLockFill <> FileLockFillProps(size = 24, color = "blue")
 */
def FileLockFill = (props: FileLockFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 2L21 7V21.0082C21 21.556 20.5551 22 20.0066 22H3.9934C3.44476 22 3 21.5447 3 21.0082V2.9918C3 2.44405 3.44495 2 3.9934 2H16ZM15 11V10C15 8.34315 13.6569 7 12 7C10.3431 7 9 8.34315 9 10V11H8V16H16V11H15ZM13 11H11V10C11 9.44772 11.4477 9 12 9C12.5523 9 13 9.44772 13 10V11Z")
  )
}
