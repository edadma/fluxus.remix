/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FileTransferLine icon from the Remix Icon library, Document category.
 */
case class FileTransferLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FileTransferLine icon component.
 *
 * @example FileTransferLine <> FileTransferLineProps(size = 24, color = "blue")
 */
def FileTransferLine = (props: FileTransferLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15 4H5V20H19V8H15V4ZM3 2.9918C3 2.44405 3.44749 2 3.9985 2H16L20.9997 7L21 20.9925C21 21.5489 20.5551 22 20.0066 22H3.9934C3.44476 22 3 21.5447 3 21.0082V2.9918ZM12 11V8L16 12L12 16V13H8V11H12Z")
  )
}
