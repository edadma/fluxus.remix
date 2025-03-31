/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FileGifLine icon from the Remix Icon library, Document category.
 */
case class FileGifLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FileGifLine icon component.
 *
 * @example FileGifLine <> FileGifLineProps(size = 24, color = "blue")
 */
def FileGifLine = (props: FileGifLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 2L20.9997 7L21 20.9925C21 21.5489 20.5551 22 20.0066 22H3.9934C3.44476 22 3 21.5447 3 21.0082V2.9918C3 2.44405 3.44749 2 3.9985 2H16ZM15 4H5V20H19V8H15V4ZM13 10V15H12V10H13ZM11 10V11H9C8.44772 11 8 11.4477 8 12V13C8 13.5523 8.44772 14 9 14H10V13H9V12H11V14C11 14.5523 10.5523 15 10 15H9C7.89543 15 7 14.1046 7 13V12C7 10.8954 7.89543 10 9 10H11ZM17 10V11H15V12H17V13H15V15H14V10H17Z")
  )
}
