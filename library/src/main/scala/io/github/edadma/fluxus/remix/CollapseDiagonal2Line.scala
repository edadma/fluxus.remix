/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CollapseDiagonal2Line icon from the Remix Icon library, Arrows category.
 */
case class CollapseDiagonal2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CollapseDiagonal2Line icon component.
 *
 * @example CollapseDiagonal2Line <> CollapseDiagonal2LineProps(size = 24, color = "blue")
 */
def CollapseDiagonal2Line = (props: CollapseDiagonal2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9.00008 4.00008H11.0001V11.0001H4.00008V9.00008H7.58586L3.29297 4.70718L4.70718 3.29297L9.00008 7.58586V4.00008ZM20 15H16.4142L20.7071 19.2929L19.2929 20.7071L15 16.4142V20H13V13H20V15Z")
  )
}
