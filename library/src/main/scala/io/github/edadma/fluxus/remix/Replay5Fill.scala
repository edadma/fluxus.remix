/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Replay5Fill icon from the Remix Icon library, Media category.
 */
case class Replay5FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Replay5Fill icon component.
 *
 * @example Replay5Fill <> Replay5FillProps(size = 24, color = "blue")
 */
def Replay5Fill = (props: Replay5FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22 12C22 6.47715 17.5228 2 12 2 8.9841 2 6.28002 3.33509 4.44656 5.44648L2 3V9H8L5.86492 6.86543C7.33243 5.11383 9.53614 4 12 4 16.4183 4 20 7.58172 20 12 20 16.4183 16.4183 20 12 20 7.58172 20 4 16.4183 4 12H2C2 17.5228 6.47715 22 12 22 17.5228 22 22 17.5228 22 12ZM14.5 10V8.5H9.5V12.75H12.625C12.9702 12.75 13.25 13.0298 13.25 13.375 13.25 13.7202 12.9702 14 12.625 14H9.5V15.5H12.625C13.7986 15.5 14.75 14.5486 14.75 13.375 14.75 12.2014 13.7986 11.25 12.625 11.25H11V10H14.5Z")
  )
}
