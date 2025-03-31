/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FileEditFill icon from the Remix Icon library, Document category.
 */
case class FileEditFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FileEditFill icon component.
 *
 * @example FileEditFill <> FileEditFillProps(size = 24, color = "blue")
 */
def FileEditFill = (props: FileEditFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 15.2426V21.0082C21 21.556 20.5551 22 20.0066 22H3.9934C3.44476 22 3 21.5511 3 20.9925V9H9C9.55228 9 10 8.55228 10 8V2H20.0017C20.5531 2 21 2.45531 21 2.9918V6.75736L12.0012 15.7562L11.995 19.995L16.2414 20.0012L21 15.2426ZM21.7782 8.80761L23.1924 10.2218L15.4142 18L13.9979 17.9979L14 16.5858L21.7782 8.80761ZM3 7L8 2.00318V7H3Z")
  )
}
