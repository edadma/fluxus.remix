/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftDownBoxFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftDownBoxFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftDownBoxFill icon component.
 *
 * @example ArrowLeftDownBoxFill <> ArrowLeftDownBoxFillProps(size = 24, color = "blue")
 */
def ArrowLeftDownBoxFill = (props: ArrowLeftDownBoxFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 3C3.44772 3 3 3.44772 3 4V20C3 20.5523 3.44772 21 4 21H20C20.5523 21 21 20.5523 21 20V4C21 3.44772 20.5523 3 20 3H4ZM8 15.9991V7.58489L11.5 11.0849L15.2929 7.29199L16.7071 8.70621L12.9142 12.4991L16.4142 15.9991H8Z")
  )
}
