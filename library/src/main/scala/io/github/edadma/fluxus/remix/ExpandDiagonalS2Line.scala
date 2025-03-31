/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandDiagonalS2Line icon from the Remix Icon library, Arrows category.
 */
case class ExpandDiagonalS2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandDiagonalS2Line icon component.
 *
 * @example ExpandDiagonalS2Line <> ExpandDiagonalS2LineProps(size = 24, color = "blue")
 */
def ExpandDiagonalS2Line = (props: ExpandDiagonalS2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 8.41421V12L5 12L5 5L12 5V7L8.41421 7L17 15.5858V12L19 12L19 19H12V17H15.5858L7 8.41421Z")
  )
}
