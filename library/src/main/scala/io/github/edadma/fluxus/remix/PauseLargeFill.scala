/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PauseLargeFill icon from the Remix Icon library, Media category.
 */
case class PauseLargeFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PauseLargeFill icon component.
 *
 * @example PauseLargeFill <> PauseLargeFillProps(size = 24, color = "blue")
 */
def PauseLargeFill = (props: PauseLargeFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6 3H8V21H6V3ZM16 3H18V21H16V3Z")
  )
}
