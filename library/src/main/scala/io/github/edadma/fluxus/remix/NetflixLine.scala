/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * NetflixLine icon from the Remix Icon library, Logos category.
 */
case class NetflixLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * NetflixLine icon component.
 *
 * @example NetflixLine <> NetflixLineProps(size = 24, color = "blue")
 */
def NetflixLine = (props: NetflixLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.9853 17.2079L16.001 2H18.001V22C17.3209 21.7333 16.6476 21.5667 15.9809 21.5L8.00098 6.30216V21.5C7.33431 21.5667 6.66764 21.7333 6.00098 22V2H8.00098L15.9853 17.2079Z")
  )
}
