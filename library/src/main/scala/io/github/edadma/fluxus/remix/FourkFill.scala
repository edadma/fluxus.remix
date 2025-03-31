/** This icon is part of Remix Icon library (https://remixicon.com/) Licensed under the Apache License 2.0
  * https://github.com/Remix-Design/RemixIcon/blob/master/License
  */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/** 4kFill icon from the Remix Icon library, Media category.
  */
case class FourkFillProps(
    size: Int = 24,
    color: String = "currentColor",
    className: String = "",
)

/** 4kFill icon component.
  *
  * @example
  *   4kFill <> 4kFillProps(size = 24, color = "blue")
  */
def FourkFill = (props: FourkFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns   := "http://www.w3.org/2000/svg",
    width   := props.size.toString,
    height  := props.size.toString,
    fill    := props.color,
    cls     := props.className,
    path(
      d := "M3 3H21C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3ZM11.5 13.5V12H10.5V9H9V12H7.5V9H6V13.5H9V15H10.5V13.5H11.5ZM18 15L15.75 12L18 9H16.25L14.5 11.25V9H13V15H14.5V12.75L16.25 15H18Z",
    ),
  )
}
