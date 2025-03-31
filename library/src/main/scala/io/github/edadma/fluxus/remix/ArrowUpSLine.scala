/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowUpSLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowUpSLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowUpSLine icon component.
 *
 * @example ArrowUpSLine <> ArrowUpSLineProps(size = 24, color = "blue")
 */
def ArrowUpSLine = (props: ArrowUpSLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11.9999 10.8284L7.0502 15.7782L5.63599 14.364L11.9999 8L18.3639 14.364L16.9497 15.7782L11.9999 10.8284Z")
  )
}
