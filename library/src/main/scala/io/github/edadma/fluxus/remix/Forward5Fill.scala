/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Forward5Fill icon from the Remix Icon library, Media category.
 */
case class Forward5FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Forward5Fill icon component.
 *
 * @example Forward5Fill <> Forward5FillProps(size = 24, color = "blue")
 */
def Forward5Fill = (props: Forward5FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 12C2 6.47715 6.47715 2 12 2 15.0159 2 17.72 3.33509 19.5534 5.44648L22 3V9H16L18.1351 6.86543C16.6676 5.11383 14.4639 4 12 4 7.58172 4 4 7.58172 4 12 4 16.4183 7.58172 20 12 20 16.4183 20 20 16.4183 20 12H22C22 17.5228 17.5228 22 12 22 6.47715 22 2 17.5228 2 12ZM14.5 10V8.5H9.5V12.75H12.625C12.9702 12.75 13.25 13.0298 13.25 13.375 13.25 13.7202 12.9702 14 12.625 14H9.5V15.5H12.625C13.7986 15.5 14.75 14.5486 14.75 13.375 14.75 12.2014 13.7986 11.25 12.625 11.25H11V10H14.5Z")
  )
}
