/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ChatFollowUpLine icon from the Remix Icon library, Communication category.
 */
case class ChatFollowUpLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ChatFollowUpLine icon component.
 *
 * @example ChatFollowUpLine <> ChatFollowUpLineProps(size = 24, color = "blue")
 */
def ChatFollowUpLine = (props: ChatFollowUpLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 3C21.5523 3 22 3.44772 22 4V18C22 18.5523 21.5523 19 21 19H6.455L2 22.5V4C2 3.44772 2.44772 3 3 3H21ZM20 5H4V18.385L5.76333 17H20V5ZM17 7V15H15V7H17ZM11 8V9.999L13 10V12L11 11.999V14H9V11.999L7 12V10L9 9.999V8H11Z")
  )
}
