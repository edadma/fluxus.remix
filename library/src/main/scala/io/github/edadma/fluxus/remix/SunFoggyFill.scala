/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SunFoggyFill icon from the Remix Icon library, Weather category.
 */
case class SunFoggyFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SunFoggyFill icon component.
 *
 * @example SunFoggyFill <> SunFoggyFillProps(size = 24, color = "blue")
 */
def SunFoggyFill = (props: SunFoggyFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6.34141 14C6.12031 13.3744 6 12.7013 6 12C6 8.68629 8.68629 6 12 6C15.3137 6 18 8.68629 18 12C18 15.3137 15.3137 18 12 18V14H6.34141ZM6 20H15V22H6V20ZM1 11H4V13H1V11ZM2 16H10V18H2V16ZM11 1H13V4H11V1ZM3.51472 4.92893L4.92893 3.51472L7.05025 5.63604L5.63604 7.05025L3.51472 4.92893ZM16.9497 18.364L18.364 16.9497L20.4853 19.0711L19.0711 20.4853L16.9497 18.364ZM19.0711 3.51472L20.4853 4.92893L18.364 7.05025L16.9497 5.63604L19.0711 3.51472ZM23 11V13H20V11H23Z")
  )
}
