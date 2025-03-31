/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ToggleFill icon from the Remix Icon library, System category.
 */
case class ToggleFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ToggleFill icon component.
 *
 * @example ToggleFill <> ToggleFillProps(size = 24, color = "blue")
 */
def ToggleFill = (props: ToggleFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8 5H16C19.866 5 23 8.13401 23 12C23 15.866 19.866 19 16 19H8C4.13401 19 1 15.866 1 12C1 8.13401 4.13401 5 8 5ZM16 15C17.6569 15 19 13.6569 19 12C19 10.3431 17.6569 9 16 9C14.3431 9 13 10.3431 13 12C13 13.6569 14.3431 15 16 15Z")
  )
}
