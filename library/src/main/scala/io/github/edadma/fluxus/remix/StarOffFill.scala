/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * StarOffFill icon from the Remix Icon library, System category.
 */
case class StarOffFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * StarOffFill icon component.
 *
 * @example StarOffFill <> StarOffFillProps(size = 24, color = "blue")
 */
def StarOffFill = (props: StarOffFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M23.4132 8.7918L18.0211 13.7783L9.70961 5.46678L12.0006 0.5L15.3862 7.84006L23.4132 8.7918ZM18.6224 20.0361L21.193 22.6067L22.6072 21.1925L2.80818 1.39348L1.39397 2.80769L6.65832 8.07205L0.587891 8.7918L6.52248 14.2799L4.94715 22.2082L12.0006 18.26L19.054 22.2082L18.6224 20.0361Z")
  )
}
