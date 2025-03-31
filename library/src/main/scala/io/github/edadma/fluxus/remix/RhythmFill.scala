/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * RhythmFill icon from the Remix Icon library, Media category.
 */
case class RhythmFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * RhythmFill icon component.
 *
 * @example RhythmFill <> RhythmFillProps(size = 24, color = "blue")
 */
def RhythmFill = (props: RhythmFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 9H4V21H2V9ZM8 3H10V21H8V3ZM14 12H16V21H14V12ZM20 6H22V21H20V6Z")
  )
}
