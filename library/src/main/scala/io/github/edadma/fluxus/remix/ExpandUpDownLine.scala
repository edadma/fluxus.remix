/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandUpDownLine icon from the Remix Icon library, Arrows category.
 */
case class ExpandUpDownLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandUpDownLine icon component.
 *
 * @example ExpandUpDownLine <> ExpandUpDownLineProps(size = 24, color = "blue")
 */
def ExpandUpDownLine = (props: ExpandUpDownLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18.2072 9.0428 12.0001 2.83569 5.793 9.0428 7.20721 10.457 12.0001 5.66412 16.793 10.457 18.2072 9.0428ZM5.79285 14.9572 12 21.1643 18.2071 14.9572 16.7928 13.543 12 18.3359 7.20706 13.543 5.79285 14.9572Z")
  )
}
