/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DraftFill icon from the Remix Icon library, Document category.
 */
case class DraftFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DraftFill icon component.
 *
 * @example DraftFill <> DraftFillProps(size = 24, color = "blue")
 */
def DraftFill = (props: DraftFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 2C20.5523 2 21 2.44772 21 3V6.757L12.0012 15.7562L11.995 19.995L16.2414 20.0012L21 15.242V21C21 21.5523 20.5523 22 20 22H4C3.44772 22 3 21.5523 3 21V3C3 2.44772 3.44772 2 4 2H20ZM21.7782 8.80761L23.1924 10.2218L15.4142 18L13.9979 17.9979L14 16.5858L21.7782 8.80761ZM12 12H7V14H12V12ZM15 8H7V10H15V8Z")
  )
}
