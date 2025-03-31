/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * AnticlockwiseFill icon from the Remix Icon library, Design category.
 */
case class AnticlockwiseFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * AnticlockwiseFill icon component.
 *
 * @example AnticlockwiseFill <> AnticlockwiseFillProps(size = 24, color = "blue")
 */
def AnticlockwiseFill = (props: AnticlockwiseFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6 10H9L5 15L1 10H4V8C4 5.23858 6.23858 3 9 3H13V5H9C7.34315 5 6 6.34315 6 8V10ZM11 9H21C21.5523 9 22 9.44772 22 10V20C22 20.5523 21.5523 21 21 21H11C10.4477 21 10 20.5523 10 20V10C10 9.44772 10.4477 9 11 9Z")
  )
}
