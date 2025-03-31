/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Filter2Line icon from the Remix Icon library, System category.
 */
case class Filter2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Filter2Line icon component.
 *
 * @example Filter2Line <> Filter2LineProps(size = 24, color = "blue")
 */
def Filter2Line = (props: Filter2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14 14V20L10 22V14L4 5V3H20V5L14 14ZM6.4037 5L12 13.3944L17.5963 5H6.4037Z")
  )
}
