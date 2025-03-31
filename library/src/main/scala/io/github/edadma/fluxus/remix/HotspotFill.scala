/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * HotspotFill icon from the Remix Icon library, Device category.
 */
case class HotspotFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * HotspotFill icon component.
 *
 * @example HotspotFill <> HotspotFillProps(size = 24, color = "blue")
 */
def HotspotFill = (props: HotspotFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 2V11H18V21C18 21.5523 17.5523 22 17 22H5C4.44772 22 4 21.5523 4 21V3C4 2.44772 4.44772 2 5 2H11ZM13 7C14.1046 7 15 7.89543 15 9H13V7ZM13 4C15.7614 4 18 6.23858 18 9H16C16 7.34315 14.6569 6 13 6V4ZM13 1C17.4183 1 21 4.58172 21 9H19C19 5.68629 16.3137 3 13 3V1Z")
  )
}
