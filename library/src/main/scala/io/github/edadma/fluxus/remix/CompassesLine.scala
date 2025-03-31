/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CompassesLine icon from the Remix Icon library, Design category.
 */
case class CompassesLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CompassesLine icon component.
 *
 * @example CompassesLine <> CompassesLineProps(size = 24, color = "blue")
 */
def CompassesLine = (props: CompassesLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10.9998 4.12272V1.9967H12.9998V4.12272C14.725 4.56676 15.9998 6.13286 15.9998 7.9967C15.9998 9.11439 15.5414 10.125 14.8023 10.8508L20.8658 21.3531L19.1338 22.3531L13.0708 11.8517C12.7299 11.9462 12.3708 11.9967 11.9998 11.9967C11.6289 11.9967 11.2697 11.9462 10.9288 11.8517L4.86584 22.3531L3.13379 21.3531L9.1973 10.8508C8.45823 10.125 7.99981 9.11439 7.99981 7.9967C7.99981 6.13286 9.27459 4.56676 10.9998 4.12272ZM11.9998 9.9967C13.1044 9.9967 13.9998 9.10127 13.9998 7.9967C13.9998 6.89213 13.1044 5.9967 11.9998 5.9967C10.8952 5.9967 9.99981 6.89213 9.99981 7.9967C9.99981 9.10127 10.8952 9.9967 11.9998 9.9967Z")
  )
}
