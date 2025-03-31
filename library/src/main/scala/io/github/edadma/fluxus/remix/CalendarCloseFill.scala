/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CalendarCloseFill icon from the Remix Icon library, Business category.
 */
case class CalendarCloseFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CalendarCloseFill icon component.
 *
 * @example CalendarCloseFill <> CalendarCloseFillProps(size = 24, color = "blue")
 */
def CalendarCloseFill = (props: CalendarCloseFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9 3V1H7V3H3C2.44772 3 2 3.44772 2 4V20C2 20.5523 2.44772 21 3 21H21C21.5523 21 22 20.5523 22 20V4C22 3.44772 21.5523 3 21 3H17V1H15V3H9ZM4 8H20V19H4V8ZM9.87852 9.9643L11.9999 12.0858L14.1211 9.96432L15.5354 11.3785L13.4141 13.5L15.5353 15.6211L14.1212 17.0354L11.9999 14.9142L9.87845 17.0354L8.46432 15.6211L10.5856 13.5L8.46426 11.3785L9.87852 9.9643Z")
  )
}
