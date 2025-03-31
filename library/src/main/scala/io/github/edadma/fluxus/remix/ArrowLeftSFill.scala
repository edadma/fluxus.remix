/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftSFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftSFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftSFill icon component.
 *
 * @example ArrowLeftSFill <> ArrowLeftSFillProps(size = 24, color = "blue")
 */
def ArrowLeftSFill = (props: ArrowLeftSFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8 12L14 6V18L8 12Z")
  )
}
