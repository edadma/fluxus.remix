/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * StarOffLine icon from the Remix Icon library, System category.
 */
case class StarOffLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * StarOffLine icon component.
 *
 * @example StarOffLine <> StarOffLineProps(size = 24, color = "blue")
 */
def StarOffLine = (props: StarOffLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M23.4132 8.7918L18.0211 13.7783L16.6058 12.363L18.8719 10.2674L14.039 9.69434L12.0006 5.27502L11.2169 6.97405L9.70961 5.46678L12.0006 0.5L15.3862 7.84006L23.4132 8.7918ZM8.45885 9.87258L5.12921 10.2674L8.70231 13.5717L7.75383 18.3451L12.0006 15.968L16.2473 18.3451L16.0777 17.4914L8.45885 9.87258ZM18.6224 20.0361L19.054 22.2082L12.0006 18.26L4.94715 22.2082L6.52248 14.2799L0.587891 8.7918L6.65832 8.07205L1.39397 2.80769L2.80818 1.39348L22.6072 21.1925L21.193 22.6067L18.6224 20.0361Z")
  )
}
