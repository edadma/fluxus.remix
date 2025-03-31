/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * EnglishInput icon from the Remix Icon library, Editor category.
 */
case class EnglishInputProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * EnglishInput icon component.
 *
 * @example EnglishInput <> EnglishInputProps(size = 24, color = "blue")
 */
def EnglishInput = (props: EnglishInputProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14 10H16L16.0005 10.7574C16.7154 10.279 17.5751 10 18.5 10C20.9853 10 23 12.0147 23 14.5V20H21V14.5C21 13.07 19.8255 12 18.5 12C17.1745 12 16 13.07 16 14.5V20H14V10ZM12 4V6H4V11H12V13H4V18H12V20H2V4H12Z")
  )
}
