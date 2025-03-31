/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SlideshowView icon from the Remix Icon library, Editor category.
 */
case class SlideshowViewProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SlideshowView icon component.
 *
 * @example SlideshowView <> SlideshowViewProps(size = 24, color = "blue")
 */
def SlideshowView = (props: SlideshowViewProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 4C2 3.44772 2.44772 3 3 3H21C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4ZM4 14H20V5H4V14ZM4 16V19H8V16H4ZM10 16V19H14V16H10ZM16 16V19H20V16H16Z")
  )
}
