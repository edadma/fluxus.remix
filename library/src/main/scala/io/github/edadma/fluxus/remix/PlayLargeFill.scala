/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PlayLargeFill icon from the Remix Icon library, Media category.
 */
case class PlayLargeFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PlayLargeFill icon component.
 *
 * @example PlayLargeFill <> PlayLargeFillProps(size = 24, color = "blue")
 */
def PlayLargeFill = (props: PlayLargeFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6 20.1957V3.80421C6 3.01878 6.86395 2.53993 7.53 2.95621L20.6432 11.152C21.2699 11.5436 21.2699 12.4563 20.6432 12.848L7.53 21.0437C6.86395 21.46 6 20.9812 6 20.1957Z")
  )
}
