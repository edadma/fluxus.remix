/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TakeawayFill icon from the Remix Icon library, Map category.
 */
case class TakeawayFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TakeawayFill icon component.
 *
 * @example TakeawayFill <> TakeawayFillProps(size = 24, color = "blue")
 */
def TakeawayFill = (props: TakeawayFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 1C16.5523 1 17 1.44772 17 2V2.999L22 3V9L19.98 8.999L22.7467 16.5953C22.9105 17.032 23 17.5051 23 17.999C23 20.2082 21.2091 21.999 19 21.999C17.1368 21.999 15.5711 20.7251 15.1265 19.0008L10.8738 19.0008C10.4295 20.7256 8.86357 22 7 22C5.05513 22 3.43445 20.612 3.07453 18.7725C2.43558 18.439 2 17.7704 2 17V12H11C11 12.5128 11.386 12.9355 11.8834 12.9933L12 13H14C14.5128 13 14.9355 12.614 14.9933 12.1166L15 12V3H12V1H16ZM7 16C5.89543 16 5 16.8954 5 18C5 19.1046 5.89543 20 7 20C8.10457 20 9 19.1046 9 18C9 16.8954 8.10457 16 7 16ZM19 16C17.8954 16 17 16.8954 17 18C17 19.1046 17.8954 20 19 20C20.1046 20 21 19.1046 21 18C21 16.8954 20.1046 16 19 16ZM10 3C10.5523 3 11 3.44772 11 4V11H2V4C2 3.44772 2.44772 3 3 3H10ZM20 5H17V7H20V5ZM9 5H4V6H9V5Z")
  )
}
