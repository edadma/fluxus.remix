/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FoggyFill icon from the Remix Icon library, Weather category.
 */
case class FoggyFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FoggyFill icon component.
 *
 * @example FoggyFill <> FoggyFillProps(size = 24, color = "blue")
 */
def FoggyFill = (props: FoggyFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M1.5843 13.0069C1.20753 12.0786 1 11.0635 1 10C1 5.58172 4.58172 2 9 2C12.3949 2 15.2959 4.11466 16.4576 7.09864C16.7951 7.0339 17.1436 7 17.5 7C20.5376 7 23 9.46243 23 12.5C23 12.6709 22.9922 12.8399 22.977 13.0069H1.5843ZM4 19H21V21H4V19ZM2 15H23V17H2V15Z")
  )
}
