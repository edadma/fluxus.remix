/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Folder4Fill icon from the Remix Icon library, Document category.
 */
case class Folder4FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Folder4Fill icon component.
 *
 * @example Folder4Fill <> Folder4FillProps(size = 24, color = "blue")
 */
def Folder4Fill = (props: Folder4FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8 21V11H22V20C22 20.5523 21.5523 21 21 21H8ZM6 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H10.4142L12.4142 5H21C21.5523 5 22 5.44772 22 6V9H7C6.44772 9 6 9.44772 6 10V21Z")
  )
}
