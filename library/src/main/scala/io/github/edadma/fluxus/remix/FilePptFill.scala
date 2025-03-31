/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FilePptFill icon from the Remix Icon library, Document category.
 */
case class FilePptFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FilePptFill icon component.
 *
 * @example FilePptFill <> FilePptFillProps(size = 24, color = "blue")
 */
def FilePptFill = (props: FilePptFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 2L21 7V21.0082C21 21.556 20.5551 22 20.0066 22H3.9934C3.44476 22 3 21.5447 3 21.0082V2.9918C3 2.44405 3.44495 2 3.9934 2H16ZM8 8V16H10V14H16V8H8ZM10 10H14V12H10V10Z")
  )
}
