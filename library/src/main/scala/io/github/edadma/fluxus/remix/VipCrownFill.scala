/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * VipCrownFill icon from the Remix Icon library, Finance category.
 */
case class VipCrownFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * VipCrownFill icon component.
 *
 * @example VipCrownFill <> VipCrownFillProps(size = 24, color = "blue")
 */
def VipCrownFill = (props: VipCrownFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2.00488 19H22.0049V21H2.00488V19ZM2.00488 5L7.00488 8L12.0049 2L17.0049 8L22.0049 5V17H2.00488V5Z")
  )
}
