/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowRightFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowRightFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowRightFill icon component.
 *
 * @example ArrowRightFill <> ArrowRightFillProps(size = 24, color = "blue")
 */
def ArrowRightFill = (props: ArrowRightFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 13H4V11H12V4L20 12L12 20V13Z")
  )
}
