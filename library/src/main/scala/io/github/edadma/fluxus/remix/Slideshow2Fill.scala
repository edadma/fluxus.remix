/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Slideshow2Fill icon from the Remix Icon library, Business category.
 */
case class Slideshow2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Slideshow2Fill icon component.
 *
 * @example Slideshow2Fill <> Slideshow2FillProps(size = 24, color = "blue")
 */
def Slideshow2Fill = (props: Slideshow2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 17V20H18V22H6V20H11V17H4C3.44772 17 3 16.5523 3 16V4H2V2H22V4H21V16C21 16.5523 20.5523 17 20 17H13ZM10 6V13L15 9.5L10 6Z")
  )
}
