/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * StopMiniFill icon from the Remix Icon library, Media category.
 */
case class StopMiniFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * StopMiniFill icon component.
 *
 * @example StopMiniFill <> StopMiniFillProps(size = 24, color = "blue")
 */
def StopMiniFill = (props: StopMiniFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6 7V17C6 17.5523 6.44772 18 7 18H17C17.5523 18 18 17.5523 18 17V7C18 6.44772 17.5523 6 17 6H7C6.44772 6 6 6.44772 6 7Z")
  )
}
