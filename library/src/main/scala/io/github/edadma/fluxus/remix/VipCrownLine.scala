/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * VipCrownLine icon from the Remix Icon library, Finance category.
 */
case class VipCrownLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * VipCrownLine icon component.
 *
 * @example VipCrownLine <> VipCrownLineProps(size = 24, color = "blue")
 */
def VipCrownLine = (props: VipCrownLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2.00488 19H22.0049V21H2.00488V19ZM2.00488 5L7.00488 8.5L12.0049 2L17.0049 8.5L22.0049 5V17H2.00488V5ZM4.00488 8.84131V15H20.0049V8.84131L16.5854 11.2349L12.0049 5.28024L7.42435 11.2349L4.00488 8.84131Z")
  )
}
