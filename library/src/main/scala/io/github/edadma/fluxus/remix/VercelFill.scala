/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * VercelFill icon from the Remix Icon library, Logos category.
 */
case class VercelFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * VercelFill icon component.
 *
 * @example VercelFill <> VercelFillProps(size = 24, color = "blue")
 */
def VercelFill = (props: VercelFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M23 21.6479H1L12 2.35205L23 21.6479Z")
  )
}
