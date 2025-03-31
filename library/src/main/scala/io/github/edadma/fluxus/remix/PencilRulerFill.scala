/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PencilRulerFill icon from the Remix Icon library, Design category.
 */
case class PencilRulerFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PencilRulerFill icon component.
 *
 * @example PencilRulerFill <> PencilRulerFillProps(size = 24, color = "blue")
 */
def PencilRulerFill = (props: PencilRulerFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5 18V20H9V18H5ZM3 7L7 2L11 7V22H3V7ZM21 8H19V10H21V12H18V14H21V16H19V18H21V21C21 21.5523 20.5523 22 20 22H14C13.4477 22 13 21.5523 13 21V5C13 4.44772 13.4477 4 14 4H20C20.5523 4 21 4.44772 21 5V8Z")
  )
}
