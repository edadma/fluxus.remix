/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ForbidLine icon from the Remix Icon library, System category.
 */
case class ForbidLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ForbidLine icon component.
 *
 * @example ForbidLine <> ForbidLineProps(size = 24, color = "blue")
 */
def ForbidLine = (props: ForbidLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22ZM12 20C16.4183 20 20 16.4183 20 12C20 7.58172 16.4183 4 12 4C7.58172 4 4 7.58172 4 12C4 16.4183 7.58172 20 12 20ZM8.52313 7.10891L16.8911 15.4769C16.6997 15.7454 16.4836 16.0017 16.2426 16.2426C16.0017 16.4836 15.7454 16.6997 15.4769 16.8911L7.10891 8.52313C7.30029 8.25459 7.51644 7.99828 7.75736 7.75736C7.99828 7.51644 8.25459 7.30029 8.52313 7.10891Z")
  )
}
