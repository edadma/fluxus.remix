/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FlashlightLine icon from the Remix Icon library, Weather category.
 */
case class FlashlightLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FlashlightLine icon component.
 *
 * @example FlashlightLine <> FlashlightLineProps(size = 24, color = "blue")
 */
def FlashlightLine = (props: FlashlightLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 9H21L11 24V15H4L13 0V9ZM11 11V7.22063L7.53238 13H13V17.3944L17.263 11H11Z")
  )
}
