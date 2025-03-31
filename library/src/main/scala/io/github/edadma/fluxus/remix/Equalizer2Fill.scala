/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Equalizer2Fill icon from the Remix Icon library, Media category.
 */
case class Equalizer2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Equalizer2Fill icon component.
 *
 * @example Equalizer2Fill <> Equalizer2FillProps(size = 24, color = "blue")
 */
def Equalizer2Fill = (props: Equalizer2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 7C3 5.067 4.567 3.5 6.5 3.5C8.433 3.5 10 5.067 10 7C10 8.933 8.433 10.5 6.5 10.5C4.567 10.5 3 8.933 3 7ZM20 8H12V6H20V8ZM14 17C14 15.067 15.567 13.5 17.5 13.5C19.433 13.5 21 15.067 21 17C21 18.933 19.433 20.5 17.5 20.5C15.567 20.5 14 18.933 14 17ZM12 16V18H4V16H12Z")
  )
}
