/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PauseLine icon from the Remix Icon library, Media category.
 */
case class PauseLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PauseLine icon component.
 *
 * @example PauseLine <> PauseLineProps(size = 24, color = "blue")
 */
def PauseLine = (props: PauseLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6 5H8V19H6V5ZM16 5H18V19H16V5Z")
  )
}
