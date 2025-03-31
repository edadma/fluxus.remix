/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftRightFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftRightFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftRightFill icon component.
 *
 * @example ArrowLeftRightFill <> ArrowLeftRightFillProps(size = 24, color = "blue")
 */
def ArrowLeftRightFill = (props: ArrowLeftRightFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 16V12L21 17L16 22V18H4V16H16ZM8 2V5.999L20 6V8H8V12L3 7L8 2Z")
  )
}
