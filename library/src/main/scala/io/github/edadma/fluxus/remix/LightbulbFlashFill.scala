/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * LightbulbFlashFill icon from the Remix Icon library, Others category.
 */
case class LightbulbFlashFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * LightbulbFlashFill icon component.
 *
 * @example LightbulbFlashFill <> LightbulbFlashFillProps(size = 24, color = "blue")
 */
def LightbulbFlashFill = (props: LightbulbFlashFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7.94101 18C7.64391 16.7274 6.30412 15.6857 5.75395 14.9992C4.65645 13.6297 4 11.8915 4 10C4 5.58172 7.58172 2 12 2C16.4183 2 20 5.58172 20 10C20 11.8925 19.3428 13.6315 18.2443 15.0014C17.6944 15.687 16.3558 16.7276 16.059 18H7.94101ZM16 20V21C16 22.1046 15.1046 23 14 23H10C8.89543 23 8 22.1046 8 21V20H16ZM13 10.0048V6L8.5 12.0048H11V16.0048L15.5 10.0048H13Z")
  )
}
