/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * HealthBookLine icon from the Remix Icon library, Health & Medical category.
 */
case class HealthBookLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * HealthBookLine icon component.
 *
 * @example HealthBookLine <> HealthBookLineProps(size = 24, color = "blue")
 */
def HealthBookLine = (props: HealthBookLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 2C20.5523 2 21 2.44772 21 3V21C21 21.5523 20.5523 22 20 22H6C5.44772 22 5 21.5523 5 21V19H3V17H5V15H3V13H5V11H3V9H5V7H3V5H5V3C5 2.44772 5.44772 2 6 2H20ZM19 4H7V20H19V4ZM14 8V11H17V13H13.999L14 16H12L11.999 13H9V11H12V8H14Z")
  )
}
