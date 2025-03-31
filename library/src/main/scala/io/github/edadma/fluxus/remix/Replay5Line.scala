/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Replay5Line icon from the Remix Icon library, Media category.
 */
case class Replay5LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Replay5Line icon component.
 *
 * @example Replay5Line <> Replay5LineProps(size = 24, color = "blue")
 */
def Replay5Line = (props: Replay5LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 2C17.5228 2 22 6.47715 22 12 22 17.5228 17.5228 22 12 22 6.47715 22 2 17.5228 2 12H4C4 16.4183 7.58172 20 12 20 16.4183 20 20 16.4183 20 12 20 7.58172 16.4183 4 12 4 9.25022 4 6.82447 5.38734 5.38451 7.50024L8 7.5V9.5H2V3.5H4L3.99989 5.99918C5.82434 3.57075 8.72873 2 12 2ZM9.5 8.5H14.5V10H11V11.25H12.625C13.7986 11.25 14.75 12.2014 14.75 13.375 14.75 14.5486 13.7986 15.5 12.625 15.5H9.5V14H12.625C12.9702 14 13.25 13.7202 13.25 13.375 13.25 13.0298 12.9702 12.75 12.625 12.75H9.5V8.5Z")
  )
}
