/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Notification3Fill icon from the Remix Icon library, Media category.
 */
case class Notification3FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Notification3Fill icon component.
 *
 * @example Notification3Fill <> Notification3FillProps(size = 24, color = "blue")
 */
def Notification3Fill = (props: Notification3FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 17H22V19H2V17H4V10C4 5.58172 7.58172 2 12 2C16.4183 2 20 5.58172 20 10V17ZM9 21H15V23H9V21Z")
  )
}
