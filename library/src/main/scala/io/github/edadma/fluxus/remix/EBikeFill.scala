/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * EBikeFill icon from the Remix Icon library, Map category.
 */
case class EBikeFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * EBikeFill icon component.
 *
 * @example EBikeFill <> EBikeFillProps(size = 24, color = "blue")
 */
def EBikeFill = (props: EBikeFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.5006 6.93685C17.5926 8.14727 19 10.4093 19 13V21H14.8293C14.4175 22.1652 13.3062 23 12 23C10.6938 23 9.58254 22.1652 9.17071 21H5V13C5 10.4093 6.40741 8.14727 8.49936 6.93685C8.33754 6.645 8.21115 6.33078 8.12602 6H5V4H8.12602C8.57006 2.27477 10.1362 1 12 1C13.8638 1 15.4299 2.27477 15.874 4H19V6H15.874C15.7888 6.33078 15.6625 6.645 15.5006 6.93685ZM12 14C11.4477 14 11 14.4477 11 15V20C11 20.5523 11.4477 21 12 21C12.5523 21 13 20.5523 13 20V15C13 14.4477 12.5523 14 12 14ZM12 7C13.1046 7 14 6.10457 14 5C14 3.89543 13.1046 3 12 3C10.8954 3 10 3.89543 10 5C10 6.10457 10.8954 7 12 7Z")
  )
}
