/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PlayReverseLargeFill icon from the Remix Icon library, Media category.
 */
case class PlayReverseLargeFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PlayReverseLargeFill icon component.
 *
 * @example PlayReverseLargeFill <> PlayReverseLargeFillProps(size = 24, color = "blue")
 */
def PlayReverseLargeFill = (props: PlayReverseLargeFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18 20.1957V3.80421C18 3.01878 17.1361 2.53993 16.47 2.95621L3.3568 11.152C2.73013 11.5436 2.73013 12.4563 3.3568 12.848L16.47 21.0437C17.136 21.46 18 20.9812 18 20.1957Z")
  )
}
