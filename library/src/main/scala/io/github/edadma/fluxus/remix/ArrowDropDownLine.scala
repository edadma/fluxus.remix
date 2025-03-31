/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowDropDownLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowDropDownLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowDropDownLine icon component.
 *
 * @example ArrowDropDownLine <> ArrowDropDownLineProps(size = 24, color = "blue")
 */
def ArrowDropDownLine = (props: ArrowDropDownLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 15.0006L7.75732 10.758L9.17154 9.34375L12 12.1722L14.8284 9.34375L16.2426 10.758L12 15.0006Z")
  )
}
