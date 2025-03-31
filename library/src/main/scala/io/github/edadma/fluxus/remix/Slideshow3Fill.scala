/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Slideshow3Fill icon from the Remix Icon library, Business category.
 */
case class Slideshow3FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Slideshow3Fill icon component.
 *
 * @example Slideshow3Fill <> Slideshow3FillProps(size = 24, color = "blue")
 */
def Slideshow3Fill = (props: Slideshow3FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 18V20H17V22H7V20H11V18H3C2.44772 18 2 17.5523 2 17V4C2 3.44772 2.44772 3 3 3H21C21.5523 3 22 3.44772 22 4V17C22 17.5523 21.5523 18 21 18H13ZM10 7.5V13.5L15 10.5L10 7.5Z")
  )
}
