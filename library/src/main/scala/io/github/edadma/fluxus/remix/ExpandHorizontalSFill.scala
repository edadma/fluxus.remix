/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandHorizontalSFill icon from the Remix Icon library, Arrows category.
 */
case class ExpandHorizontalSFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandHorizontalSFill icon component.
 *
 * @example ExpandHorizontalSFill <> ExpandHorizontalSFillProps(size = 24, color = "blue")
 */
def ExpandHorizontalSFill = (props: ExpandHorizontalSFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7.44975 7.05017L2.5 11.9999L7.44727 16.9472L7.44826 12.9999H16.5501L16.55 16.9491L21.5 11.9994L16.5503 7.04968L16.5502 10.9999H7.44876L7.44975 7.05017Z")
  )
}
