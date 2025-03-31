/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Equalizer3Line icon from the Remix Icon library, Media category.
 */
case class Equalizer3LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Equalizer3Line icon component.
 *
 * @example Equalizer3Line <> Equalizer3LineProps(size = 24, color = "blue")
 */
def Equalizer3Line = (props: Equalizer3LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 3V6H3V8H7V11H9V3H7ZM11 8H21V6H11V8ZM17 13V16H21V18H17V21H15V13H17ZM13 18H3V16H13V18Z")
  )
}
