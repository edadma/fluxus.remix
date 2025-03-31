/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FlashlightFill icon from the Remix Icon library, Weather category.
 */
case class FlashlightFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FlashlightFill icon component.
 *
 * @example FlashlightFill <> FlashlightFillProps(size = 24, color = "blue")
 */
def FlashlightFill = (props: FlashlightFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 10H20L11 23V14H4L13 1V10Z")
  )
}
