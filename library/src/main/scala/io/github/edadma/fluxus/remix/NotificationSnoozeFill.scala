/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * NotificationSnoozeFill icon from the Remix Icon library, Media category.
 */
case class NotificationSnoozeFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * NotificationSnoozeFill icon component.
 *
 * @example NotificationSnoozeFill <> NotificationSnoozeFillProps(size = 24, color = "blue")
 */
def NotificationSnoozeFill = (props: NotificationSnoozeFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22 17H20V10C20 5.58172 16.4183 2 12 2C7.58172 2 4 5.58172 4 10V17H2V19H22V17ZM15 23V21H9V23H15ZM9 9V7H15V9.41421L11.4142 13H15V15H9V12.5858L12.5858 9H9Z")
  )
}
