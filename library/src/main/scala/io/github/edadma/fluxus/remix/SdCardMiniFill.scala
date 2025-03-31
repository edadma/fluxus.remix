/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SdCardMiniFill icon from the Remix Icon library, Device category.
 */
case class SdCardMiniFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SdCardMiniFill icon component.
 *
 * @example SdCardMiniFill <> SdCardMiniFillProps(size = 24, color = "blue")
 */
def SdCardMiniFill = (props: SdCardMiniFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 2H19C19.5523 2 20 2.44772 20 3V21C20 21.5523 19.5523 22 19 22H5C4.44772 22 4 21.5523 4 21V12.4196C4 12.1549 4.10493 11.901 4.29179 11.7135L5.8541 10.1464C5.94754 10.0526 6 9.92569 6 9.79335V3C6 2.44772 6.44772 2 7 2ZM15 4V8H17V4H15ZM12 4V8H14V4H12ZM9 4V8H11V4H9Z")
  )
}
