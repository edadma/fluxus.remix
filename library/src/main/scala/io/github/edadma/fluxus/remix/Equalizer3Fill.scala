/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Equalizer3Fill icon from the Remix Icon library, Media category.
 */
case class Equalizer3FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Equalizer3Fill icon component.
 *
 * @example Equalizer3Fill <> Equalizer3FillProps(size = 24, color = "blue")
 */
def Equalizer3Fill = (props: Equalizer3FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 3V6H3V8H7V11H10V3H7ZM12 8H21V6H12V8ZM17 13V16H21V18H17V21H14V13H17ZM12 18H3V16H12V18Z")
  )
}
