/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PageSeparator icon from the Remix Icon library, Editor category.
 */
case class PageSeparatorProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PageSeparator icon component.
 *
 * @example PageSeparator <> PageSeparatorProps(size = 24, color = "blue")
 */
def PageSeparator = (props: PageSeparatorProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 21V17H7V21H5V16C5 15.4477 5.44772 15 6 15H18C18.5523 15 19 15.4477 19 16V21H17ZM7 3V7H17V3H19V8C19 8.55228 18.5523 9 18 9H6C5.44772 9 5 8.55228 5 8V3H7ZM2 9L6 12L2 15V9ZM22 9V15L18 12L22 9Z")
  )
}
