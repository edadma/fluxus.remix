/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * RobotLine icon from the Remix Icon library, User & Faces category.
 */
case class RobotLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * RobotLine icon component.
 *
 * @example RobotLine <> RobotLineProps(size = 24, color = "blue")
 */
def RobotLine = (props: RobotLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 4.05493C17.5 4.55237 21 8.36745 21 13V22H3V13C3 8.36745 6.50005 4.55237 11 4.05493V1H13V4.05493ZM19 20V13C19 9.13401 15.866 6 12 6C8.13401 6 5 9.13401 5 13V20H19ZM12 18C9.23858 18 7 15.7614 7 13C7 10.2386 9.23858 8 12 8C14.7614 8 17 10.2386 17 13C17 15.7614 14.7614 18 12 18ZM12 16C13.6569 16 15 14.6569 15 13C15 11.3431 13.6569 10 12 10C10.3431 10 9 11.3431 9 13C9 14.6569 10.3431 16 12 16ZM12 14C11.4477 14 11 13.5523 11 13C11 12.4477 11.4477 12 12 12C12.5523 12 13 12.4477 13 13C13 13.5523 12.5523 14 12 14Z")
  )
}
