/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * AspectRatioLine icon from the Remix Icon library, Media category.
 */
case class AspectRatioLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * AspectRatioLine icon component.
 *
 * @example AspectRatioLine <> AspectRatioLineProps(size = 24, color = "blue")
 */
def AspectRatioLine = (props: AspectRatioLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 3C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H21ZM20 5H4V19H20V5ZM13 17V15H16V12H18V17H13ZM11 7V9H8V12H6V7H11Z")
  )
}
