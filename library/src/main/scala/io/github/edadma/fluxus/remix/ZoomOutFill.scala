/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ZoomOutFill icon from the Remix Icon library, System category.
 */
case class ZoomOutFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ZoomOutFill icon component.
 *
 * @example ZoomOutFill <> ZoomOutFillProps(size = 24, color = "blue")
 */
def ZoomOutFill = (props: ZoomOutFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18.031 16.6168L22.3137 20.8995L20.8995 22.3137L16.6168 18.031C15.0769 19.263 13.124 20 11 20C6.032 20 2 15.968 2 11C2 6.032 6.032 2 11 2C15.968 2 20 6.032 20 11C20 13.124 19.263 15.0769 18.031 16.6168ZM7 10V12H15V10H7Z")
  )
}
