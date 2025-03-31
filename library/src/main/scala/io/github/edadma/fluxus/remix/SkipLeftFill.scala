/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SkipLeftFill icon from the Remix Icon library, Arrows category.
 */
case class SkipLeftFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SkipLeftFill icon component.
 *
 * @example SkipLeftFill <> SkipLeftFillProps(size = 24, color = "blue")
 */
def SkipLeftFill = (props: SkipLeftFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 18V6H9V18H7ZM11 12 17 6V18L11 12Z")
  )
}
