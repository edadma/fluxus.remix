/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * HailFill icon from the Remix Icon library, Weather category.
 */
case class HailFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * HailFill icon component.
 *
 * @example HailFill <> HailFillProps(size = 24, color = "blue")
 */
def HailFill = (props: HailFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18.9948 17.7944C18.8878 15.6808 17.1402 14 15 14C14.622 14 14.2562 14.0524 13.9096 14.1504C13.5201 12.3494 11.9176 11 10 11C7.79086 11 6 12.7909 6 15C6 16.0794 6.42752 17.0589 7.12246 17.7784C3.61004 16.9337 1 13.7716 1 10C1 5.58172 4.58172 2 9 2C12.3949 2 15.2959 4.11466 16.4576 7.09864C16.7951 7.0339 17.1436 7 17.5 7C20.5376 7 23 9.46243 23 12.5C23 15.0194 21.306 17.1432 18.9948 17.7944ZM10 17C8.89543 17 8 16.1046 8 15C8 13.8954 8.89543 13 10 13C11.1046 13 12 13.8954 12 15C12 16.1046 11.1046 17 10 17ZM15 20C13.8954 20 13 19.1046 13 18C13 16.8954 13.8954 16 15 16C16.1046 16 17 16.8954 17 18C17 19.1046 16.1046 20 15 20ZM10 23C8.89543 23 8 22.1046 8 21C8 19.8954 8.89543 19 10 19C11.1046 19 12 19.8954 12 21C12 22.1046 11.1046 23 10 23Z")
  )
}
