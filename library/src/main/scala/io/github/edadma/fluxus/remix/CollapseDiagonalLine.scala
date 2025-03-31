/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CollapseDiagonalLine icon from the Remix Icon library, Arrows category.
 */
case class CollapseDiagonalLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CollapseDiagonalLine icon component.
 *
 * @example CollapseDiagonalLine <> CollapseDiagonalLineProps(size = 24, color = "blue")
 */
def CollapseDiagonalLine = (props: CollapseDiagonalLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15 4.00008H13V11.0001H20V9.00008H16.4142L20.7071 4.70718L19.2929 3.29297L15 7.58586V4.00008ZM4.00008 15H7.58586L3.29297 19.2929L4.70718 20.7071L9.00008 16.4142V20H11.0001V13H4.00008V15Z")
  )
}
