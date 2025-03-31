/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowDropRightFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowDropRightFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowDropRightFill icon component.
 *
 * @example ArrowDropRightFill <> ArrowDropRightFillProps(size = 24, color = "blue")
 */
def ArrowDropRightFill = (props: ArrowDropRightFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14 12L10 16V8L14 12Z")
  )
}
