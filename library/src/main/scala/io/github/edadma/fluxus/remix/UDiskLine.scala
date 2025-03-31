/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * UDiskLine icon from the Remix Icon library, Device category.
 */
case class UDiskLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * UDiskLine icon component.
 *
 * @example UDiskLine <> UDiskLineProps(size = 24, color = "blue")
 */
def UDiskLine = (props: UDiskLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19 12H5V20H19V12ZM5 10V2H19V10H20C20.5523 10 21 10.4477 21 11V21C21 21.5523 20.5523 22 20 22H4C3.44772 22 3 21.5523 3 21V11C3 10.4477 3.44772 10 4 10H5ZM7 10H17V4H7V10ZM9 6H11V8H9V6ZM13 6H15V8H13V6Z")
  )
}
