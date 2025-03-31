/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CollapseDiagonalFill icon from the Remix Icon library, Arrows category.
 */
case class CollapseDiagonalFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CollapseDiagonalFill icon component.
 *
 * @example CollapseDiagonalFill <> CollapseDiagonalFillProps(size = 24, color = "blue")
 */
def CollapseDiagonalFill = (props: CollapseDiagonalFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20.5 11.0001H13V3.50008L16.0429 6.54297L19.2929 3.29297L20.7071 4.70718L17.4571 7.95718L20.5 11.0001ZM3.50008 13H11.0001V20.5L7.95718 17.4571L4.70718 20.7071L3.29297 19.2929L6.54297 16.0429L3.50008 13Z")
  )
}
