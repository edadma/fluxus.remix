/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DragDropFill icon from the Remix Icon library, Design category.
 */
case class DragDropFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DragDropFill icon component.
 *
 * @example DragDropFill <> DragDropFillProps(size = 24, color = "blue")
 */
def DragDropFill = (props: DragDropFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14 6H16V8H21C21.5523 8 22 8.44772 22 9V16.5L16 13L16.0359 21.0622L18.2592 18.9129L20.041 22H9C8.44772 22 8 21.5523 8 21V16H6V14H8V9C8 8.44772 8.44772 8 9 8H14V6ZM22 17.338V21C22 21.107 21.9832 21.2101 21.9521 21.3068L19.9913 17.9129L22 17.338ZM4 14V16H2V14H4ZM4 10V12H2V10H4ZM4 6V8H2V6H4ZM4 2V4H2V2H4ZM8 2V4H6V2H8ZM12 2V4H10V2H12ZM16 2V4H14V2H16Z")
  )
}
