/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PlayReverseLargeLine icon from the Remix Icon library, Media category.
 */
case class PlayReverseLargeLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PlayReverseLargeLine icon component.
 *
 * @example PlayReverseLargeLine <> PlayReverseLargeLineProps(size = 24, color = "blue")
 */
def PlayReverseLargeLine = (props: PlayReverseLargeLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 18.3915V5.60846L5.77359 12L16 18.3915ZM18 3.80421V20.1957C18 20.9812 17.136 21.46 16.47 21.0437L3.3568 12.848C2.73013 12.4563 2.73013 11.5436 3.3568 11.152L16.47 2.95621C17.1361 2.53993 18 3.01878 18 3.80421Z")
  )
}
