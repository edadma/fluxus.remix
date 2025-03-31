/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ChatHistoryLine icon from the Remix Icon library, Communication category.
 */
case class ChatHistoryLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ChatHistoryLine icon component.
 *
 * @example ChatHistoryLine <> ChatHistoryLineProps(size = 24, color = "blue")
 */
def ChatHistoryLine = (props: ChatHistoryLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C10.298 22 8.69525 21.5748 7.29229 20.8248L2 22L3.17629 16.7097C2.42562 15.3063 2 13.7028 2 12C2 6.47715 6.47715 2 12 2ZM12 4C7.58172 4 4 7.58172 4 12C4 13.3347 4.32563 14.6181 4.93987 15.7664L5.28952 16.4201L4.63445 19.3663L7.58189 18.7118L8.23518 19.061C9.38315 19.6747 10.6659 20 12 20C16.4183 20 20 16.4183 20 12C20 7.58172 16.4183 4 12 4ZM13 7V12H17V14H11V7H13Z")
  )
}
