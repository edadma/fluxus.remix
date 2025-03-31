/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftLongFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftLongFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftLongFill icon component.
 *
 * @example ArrowLeftLongFill <> ArrowLeftLongFillProps(size = 24, color = "blue")
 */
def ArrowLeftLongFill = (props: ArrowLeftLongFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22.0003 12.9999L22.0004 11L8.41421 11V5.58582L2 12L8.41421 18.4142L8.41421 13L22.0003 12.9999Z")
  )
}
