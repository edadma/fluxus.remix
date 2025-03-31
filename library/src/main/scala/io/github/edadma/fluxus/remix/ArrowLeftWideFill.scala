/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftWideFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftWideFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftWideFill icon component.
 *
 * @example ArrowLeftWideFill <> ArrowLeftWideFillProps(size = 24, color = "blue")
 */
def ArrowLeftWideFill = (props: ArrowLeftWideFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8.3685 12L13.1162 3.03212L14.8838 3.9679L10.6315 12L14.8838 20.0321L13.1162 20.9679L8.3685 12Z")
  )
}
