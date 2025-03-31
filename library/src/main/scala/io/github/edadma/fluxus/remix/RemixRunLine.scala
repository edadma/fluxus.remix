/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * RemixRunLine icon from the Remix Icon library, Logos category.
 */
case class RemixRunLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * RemixRunLine icon component.
 *
 * @example RemixRunLine <> RemixRunLineProps(size = 24, color = "blue")
 */
def RemixRunLine = (props: RemixRunLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 2H14.5C17.8137 2 20.5 4.68629 20.5 8C20.5 10.1984 19.3177 12.1206 17.5543 13.1655C19.0376 14.2579 20 16.0166 20 18V21H18V18C18 15.7909 16.2091 14 14 14H4V12H14.5C16.7091 12 18.5 10.2091 18.5 8C18.5 5.79086 16.7091 4 14.5 4H4V2ZM11 21H4V19H11V21Z")
  )
}
