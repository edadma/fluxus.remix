/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Filter3Line icon from the Remix Icon library, System category.
 */
case class Filter3LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Filter3Line icon component.
 *
 * @example Filter3Line <> Filter3LineProps(size = 24, color = "blue")
 */
def Filter3Line = (props: Filter3LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10 18H14V16H10V18ZM3 6V8H21V6H3ZM6 13H18V11H6V13Z")
  )
}
