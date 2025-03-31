/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CollapseDiagonal2Fill icon from the Remix Icon library, Arrows category.
 */
case class CollapseDiagonal2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CollapseDiagonal2Fill icon component.
 *
 * @example CollapseDiagonal2Fill <> CollapseDiagonal2FillProps(size = 24, color = "blue")
 */
def CollapseDiagonal2Fill = (props: CollapseDiagonal2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3.50008 11.0001H11.0001V3.50008L7.95718 6.54297L4.70718 3.29297L3.29297 4.70718L6.54297 7.95718L3.50008 11.0001ZM20.5 13H13V20.5L16.0429 17.4571L19.2929 20.7071L20.7071 19.2929L17.4571 16.0429L20.5 13Z")
  )
}
