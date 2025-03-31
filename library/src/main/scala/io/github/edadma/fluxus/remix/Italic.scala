/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Italic icon from the Remix Icon library, Editor category.
 */
case class ItalicProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Italic icon component.
 *
 * @example Italic <> ItalicProps(size = 24, color = "blue")
 */
def Italic = (props: ItalicProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15 20H7V18H9.92661L12.0425 6H9V4H17V6H14.0734L11.9575 18H15V20Z")
  )
}
