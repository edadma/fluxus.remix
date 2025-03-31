/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FullscreenExitLine icon from the Remix Icon library, Media category.
 */
case class FullscreenExitLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FullscreenExitLine icon component.
 *
 * @example FullscreenExitLine <> FullscreenExitLineProps(size = 24, color = "blue")
 */
def FullscreenExitLine = (props: FullscreenExitLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18 7H22V9H16V3H18V7ZM8 9H2V7H6V3H8V9ZM18 17V21H16V15H22V17H18ZM8 15V21H6V17H2V15H8Z")
  )
}
