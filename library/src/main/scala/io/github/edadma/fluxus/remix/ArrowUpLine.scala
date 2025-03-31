/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowUpLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowUpLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowUpLine icon component.
 *
 * @example ArrowUpLine <> ArrowUpLineProps(size = 24, color = "blue")
 */
def ArrowUpLine = (props: ArrowUpLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.0001 7.82843V20H11.0001V7.82843L5.63614 13.1924L4.22192 11.7782L12.0001 4L19.7783 11.7782L18.3641 13.1924L13.0001 7.82843Z")
  )
}
