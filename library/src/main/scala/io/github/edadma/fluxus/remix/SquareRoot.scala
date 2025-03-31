/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SquareRoot icon from the Remix Icon library, Editor category.
 */
case class SquareRootProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SquareRoot icon component.
 *
 * @example SquareRoot <> SquareRootProps(size = 24, color = "blue")
 */
def SquareRoot = (props: SquareRootProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.382 4H22V6H16.618L9 21.2361L5.38197 14H2V12H6.61803L9 16.7639L15.382 4Z")
  )
}
