/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DoubanLine icon from the Remix Icon library, Logos category.
 */
case class DoubanLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DoubanLine icon component.
 *
 * @example DoubanLine <> DoubanLineProps(size = 24, color = "blue")
 */
def DoubanLine = (props: DoubanLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.2735 15H5V7H19V15H17.3764L16.0767 19H21V21H3V19H7.6123L6.8 16.5L8.70211 15.882L9.71522 19H13.9738L15.2735 15ZM3.5 3H20.5V5H3.5V3ZM7 9V13H17V9H7Z")
  )
}
