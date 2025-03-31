/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandHorizontalSLine icon from the Remix Icon library, Arrows category.
 */
case class ExpandHorizontalSLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandHorizontalSLine icon component.
 *
 * @example ExpandHorizontalSLine <> ExpandHorizontalSLineProps(size = 24, color = "blue")
 */
def ExpandHorizontalSLine = (props: ExpandHorizontalSLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7.44975 7.05029L2.5 12L7.44727 16.9473L8.86148 15.5331L6.32843 13H17.6708L15.1358 15.535L16.55 16.9493L21.5 11.9996L16.5503 7.0498L15.136 8.46402L17.6721 11H6.32843L8.86396 8.46451L7.44975 7.05029Z")
  )
}
