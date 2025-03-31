/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CalendarTodoFill icon from the Remix Icon library, Business category.
 */
case class CalendarTodoFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CalendarTodoFill icon component.
 *
 * @example CalendarTodoFill <> CalendarTodoFillProps(size = 24, color = "blue")
 */
def CalendarTodoFill = (props: CalendarTodoFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 3H21C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H7V1H9V3H15V1H17V3ZM4 9V19H20V9H4ZM6 11H8V13H6V11ZM6 15H8V17H6V15ZM10 11H18V13H10V11ZM10 15H15V17H10V15Z")
  )
}
