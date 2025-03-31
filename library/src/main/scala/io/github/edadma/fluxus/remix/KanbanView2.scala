/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * KanbanView2 icon from the Remix Icon library, Editor category.
 */
case class KanbanView2Props(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * KanbanView2 icon component.
 *
 * @example KanbanView2 <> KanbanView2Props(size = 24, color = "blue")
 */
def KanbanView2 = (props: KanbanView2Props) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 4C2 3.44772 2.44772 3 3 3H21C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4ZM16 19H20V5H16V19ZM14 5H10V19H14V5ZM4 5V19H8V5H4Z")
  )
}
