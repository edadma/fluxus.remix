/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowTurnForwardLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowTurnForwardLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowTurnForwardLine icon component.
 *
 * @example ArrowTurnForwardLine <> ArrowTurnForwardLineProps(size = 24, color = "blue")
 */
def ArrowTurnForwardLine = (props: ArrowTurnForwardLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17.0004 5.82843V13C17.0004 16.3137 14.3141 19 11.0004 19C7.68672 19 5.00043 16.3137 5.00043 13V4H3.00043V13C3.00043 17.4183 6.58215 21 11.0004 21C15.4187 21 19.0004 17.4183 19.0004 13V5.82843L21.536 8.36396L22.9502 6.94975L18.0004 2L13.0507 6.94975L14.4649 8.36396L17.0004 5.82843Z")
  )
}
