/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowRightDownBoxFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowRightDownBoxFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowRightDownBoxFill icon component.
 *
 * @example ArrowRightDownBoxFill <> ArrowRightDownBoxFillProps(size = 24, color = "blue")
 */
def ArrowRightDownBoxFill = (props: ArrowRightDownBoxFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 3C3.44772 3 3 3.44772 3 4V20C3 20.5523 3.44772 21 4 21H20C20.5523 21 21 20.5523 21 20V4C21 3.44772 20.5523 3 20 3H4ZM16.0001 15.9991H7.58586L11.0859 12.4991L7.29297 8.70621L8.70718 7.29199L12.5001 11.0849L16.0001 7.58489V15.9991Z")
  )
}
