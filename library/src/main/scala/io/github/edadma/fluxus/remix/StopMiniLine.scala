/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * StopMiniLine icon from the Remix Icon library, Media category.
 */
case class StopMiniLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * StopMiniLine icon component.
 *
 * @example StopMiniLine <> StopMiniLineProps(size = 24, color = "blue")
 */
def StopMiniLine = (props: StopMiniLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6 7C6 6.44772 6.44772 6 7 6H17C17.5523 6 18 6.44772 18 7V17C18 17.5523 17.5523 18 17 18H7C6.44772 18 6 17.5523 6 17V7ZM8 8V16H16V8H8Z")
  )
}
