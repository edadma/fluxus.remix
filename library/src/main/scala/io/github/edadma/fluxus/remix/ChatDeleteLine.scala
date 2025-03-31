/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ChatDeleteLine icon from the Remix Icon library, Communication category.
 */
case class ChatDeleteLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ChatDeleteLine icon component.
 *
 * @example ChatDeleteLine <> ChatDeleteLineProps(size = 24, color = "blue")
 */
def ChatDeleteLine = (props: ChatDeleteLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6.45455 19L2 22.5V4C2 3.44772 2.44772 3 3 3H21C21.5523 3 22 3.44772 22 4V18C22 18.5523 21.5523 19 21 19H6.45455ZM4 18.3851L5.76282 17H20V5H4V18.3851ZM13.4142 11L15.8891 13.4749L14.4749 14.8891L12 12.4142L9.52513 14.8891L8.11091 13.4749L10.5858 11L8.11091 8.52513L9.52513 7.11091L12 9.58579L14.4749 7.11091L15.8891 8.52513L13.4142 11Z")
  )
}
