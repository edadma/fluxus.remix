/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowRightWideLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowRightWideLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowRightWideLine icon component.
 *
 * @example ArrowRightWideLine <> ArrowRightWideLineProps(size = 24, color = "blue")
 */
def ArrowRightWideLine = (props: ArrowRightWideLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.6315 12L10.8838 3.03212L9.11622 3.9679L13.3685 12L9.11622 20.0321L10.8838 20.9679L15.6315 12Z")
  )
}
