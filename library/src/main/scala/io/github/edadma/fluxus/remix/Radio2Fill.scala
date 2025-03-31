/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Radio2Fill icon from the Remix Icon library, Media category.
 */
case class Radio2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Radio2Fill icon component.
 *
 * @example Radio2Fill <> Radio2FillProps(size = 24, color = "blue")
 */
def Radio2Fill = (props: Radio2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6 3V1H8V3H21.0082C21.556 3 22 3.44495 22 3.9934V20.0066C22 20.5552 21.5447 21 21.0082 21H2.9918C2.44405 21 2 20.5551 2 20.0066V3.9934C2 3.44476 2.45531 3 2.9918 3H6ZM9 15C10.6569 15 12 13.6569 12 12C12 10.3431 10.6569 9 9 9C7.34315 9 6 10.3431 6 12C6 13.6569 7.34315 15 9 15ZM14 9V11H18V9H14ZM14 13V15H18V13H14Z")
  )
}
