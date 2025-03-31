/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ChatSmile3Fill icon from the Remix Icon library, Communication category.
 */
case class ChatSmile3FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ChatSmile3Fill icon component.
 *
 * @example ChatSmile3Fill <> ChatSmile3FillProps(size = 24, color = "blue")
 */
def ChatSmile3Fill = (props: ChatSmile3FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22H2L4.92893 19.0711C3.11929 17.2614 2 14.7614 2 12C2 6.47715 6.47715 2 12 2ZM16 13H8C8 15.2091 9.79086 17 12 17C14.2091 17 16 15.2091 16 13Z")
  )
}
