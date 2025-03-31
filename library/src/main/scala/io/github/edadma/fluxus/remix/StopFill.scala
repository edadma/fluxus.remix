/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * StopFill icon from the Remix Icon library, Media category.
 */
case class StopFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * StopFill icon component.
 *
 * @example StopFill <> StopFillProps(size = 24, color = "blue")
 */
def StopFill = (props: StopFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6 5H18C18.5523 5 19 5.44772 19 6V18C19 18.5523 18.5523 19 18 19H6C5.44772 19 5 18.5523 5 18V6C5 5.44772 5.44772 5 6 5Z")
  )
}
