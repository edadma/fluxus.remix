/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ChatPollFill icon from the Remix Icon library, Communication category.
 */
case class ChatPollFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ChatPollFill icon component.
 *
 * @example ChatPollFill <> ChatPollFillProps(size = 24, color = "blue")
 */
def ChatPollFill = (props: ChatPollFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 3C21.5523 3 22 3.44772 22 4V18C22 18.5523 21.5523 19 21 19H6.455L2 22.5V4C2 3.44772 2.44772 3 3 3H21ZM13 7H11V15H13V7ZM17 9H15V15H17V9ZM9 11H7V15H9V11Z")
  )
}
