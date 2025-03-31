/** This icon is part of Remix Icon library (https://remixicon.com/) Licensed under the Apache License 2.0
  * https://github.com/Remix-Design/RemixIcon/blob/master/License
  */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/** 4kLine icon from the Remix Icon library, Media category.
  */
case class FourkLineProps(
    size: Int = 24,
    color: String = "currentColor",
    className: String = "",
)

/** 4kLine icon component.
  *
  * @example
  *   4kLine <> 4kLineProps(size = 24, color = "blue")
  */
def FourkLine = (props: FourkLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns   := "http://www.w3.org/2000/svg",
    width   := props.size.toString,
    height  := props.size.toString,
    fill    := props.color,
    cls     := props.className,
    path(
      d := "M4 5V19H20V5H4ZM3 3H21C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3ZM11.5 13.5H10.5V15H9V13.5H6V9H7.5V12H9V9H10.5V12H11.5V13.5ZM18 15H16.25L14.5 12.75V15H13V9H14.5V11.25L16.25 9H18L15.75 12L18 15Z",
    ),
  )
}
