/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * H1 icon from the Remix Icon library, Editor category.
 */
case class H1Props(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * H1 icon component.
 *
 * @example H1 <> H1Props(size = 24, color = "blue")
 */
def H1 = (props: H1Props) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 20H11V13H4V20H2V4H4V11H11V4H13V20ZM21.0005 8V20H19.0005L19 10.204L17 10.74V8.67L19.5005 8H21.0005Z")
  )
}
