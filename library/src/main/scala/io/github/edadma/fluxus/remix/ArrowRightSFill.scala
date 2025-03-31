/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowRightSFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowRightSFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowRightSFill icon component.
 *
 * @example ArrowRightSFill <> ArrowRightSFillProps(size = 24, color = "blue")
 */
def ArrowRightSFill = (props: ArrowRightSFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 12L10 18V6L16 12Z")
  )
}
