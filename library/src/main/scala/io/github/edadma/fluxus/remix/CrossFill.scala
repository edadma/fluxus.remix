/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CrossFill icon from the Remix Icon library, Others category.
 */
case class CrossFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CrossFill icon component.
 *
 * @example CrossFill <> CrossFillProps(size = 24, color = "blue")
 */
def CrossFill = (props: CrossFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14 2H10V8H4V12H10V22H14V12H20V8H14V2Z")
  )
}
