/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FileFill icon from the Remix Icon library, Document category.
 */
case class FileFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FileFill icon component.
 *
 * @example FileFill <> FileFillProps(size = 24, color = "blue")
 */
def FileFill = (props: FileFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 8L9.00319 2H19.9978C20.5513 2 21 2.45531 21 2.9918V21.0082C21 21.556 20.5551 22 20.0066 22H3.9934C3.44476 22 3 21.5501 3 20.9932V8ZM10 3.5L4.5 9H10V3.5Z")
  )
}
