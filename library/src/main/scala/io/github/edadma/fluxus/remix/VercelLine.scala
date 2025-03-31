/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * VercelLine icon from the Remix Icon library, Logos category.
 */
case class VercelLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * VercelLine icon component.
 *
 * @example VercelLine <> VercelLineProps(size = 24, color = "blue")
 */
def VercelLine = (props: VercelLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M23 21.6479L12 2.35205L1 21.6479H23ZM19.5577 19.6479H4.4423L12 6.39042L19.5577 19.6479Z")
  )
}
