/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DragDropLine icon from the Remix Icon library, Design category.
 */
case class DragDropLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DragDropLine icon component.
 *
 * @example DragDropLine <> DragDropLineProps(size = 24, color = "blue")
 */
def DragDropLine = (props: DragDropLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 13L22.9641 17.0622L19.9913 17.9129L22.116 21.5933L20.384 22.5933L18.2592 18.9129L16.0359 21.0622L16 13ZM14 6H16V8H21C21.5523 8 22 8.44772 22 9V13H20V10H10V20H14V22H9C8.44772 22 8 21.5523 8 21V16H6V14H8V9C8 8.44772 8.44772 8 9 8H14V6ZM4 14V16H2V14H4ZM4 10V12H2V10H4ZM4 6V8H2V6H4ZM4 2V4H2V2H4ZM8 2V4H6V2H8ZM12 2V4H10V2H12ZM16 2V4H14V2H16Z")
  )
}
