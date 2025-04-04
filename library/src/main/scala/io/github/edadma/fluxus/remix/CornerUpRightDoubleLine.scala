/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerUpRightDoubleLine icon from the Remix Icon library, Arrows category.
 */
case class CornerUpRightDoubleLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerUpRightDoubleLine icon component.
 *
 * @example CornerUpRightDoubleLine <> CornerUpRightDoubleLineProps(size = 24, color = "blue")
 */
def CornerUpRightDoubleLine = (props: CornerUpRightDoubleLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.00001 10.0003L3.99988 19.0001L5.99988 19.0002L5.99998 12.0002L12.1718 12.0002L8.22209 15.9499L9.63631 17.3641L16.0003 11.0001L9.63631 4.63617L8.22209 6.05038L12.1719 10.0002L4.00001 10.0003ZM15.2504 4.63617L13.8362 6.05038L18.786 11.0001L13.8362 15.9499L15.2504 17.3641L21.6144 11.0001L15.2504 4.63617Z")
  )
}
