/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowRightLongFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowRightLongFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowRightLongFill icon component.
 *
 * @example ArrowRightLongFill <> ArrowRightLongFillProps(size = 24, color = "blue")
 */
def ArrowRightLongFill = (props: ArrowRightLongFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M1.99974 12.9999L1.9996 11L15.5858 11V5.58582L22 12L15.5858 18.4142V13L1.99974 12.9999Z")
  )
}
