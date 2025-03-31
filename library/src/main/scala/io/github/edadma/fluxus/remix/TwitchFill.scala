/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TwitchFill icon from the Remix Icon library, Logos category.
 */
case class TwitchFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TwitchFill icon component.
 *
 * @example TwitchFill <> TwitchFillProps(size = 24, color = "blue")
 */
def TwitchFill = (props: TwitchFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21.001 3V14.7391L16.3053 19.4348H12.3923L9.95523 21.7826H6.91402V19.4348H3.00098V6.13043L4.2281 3H21.001ZM19.4358 4.56522H6.13141V16.3043H9.26185V18.6522L11.6097 16.3043H16.3053L19.4358 13.1739V4.56522ZM16.3053 7.69565V12.3913H14.7401V7.69565H16.3053ZM12.3923 7.69565V12.3913H10.8271V7.69565H12.3923Z")
  )
}
