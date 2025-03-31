/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ReplyFill icon from the Remix Icon library, Business category.
 */
case class ReplyFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ReplyFill icon component.
 *
 * @example ReplyFill <> ReplyFillProps(size = 24, color = "blue")
 */
def ReplyFill = (props: ReplyFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 20L1 12L11 4V9C16.5228 9 21 13.4772 21 19C21 19.2729 20.9891 19.5433 20.9676 19.8107C19.4605 16.9502 16.458 15 13 15H11V20Z")
  )
}
