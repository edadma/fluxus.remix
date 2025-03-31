/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MapPin3Fill icon from the Remix Icon library, Map category.
 */
case class MapPin3FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MapPin3Fill icon component.
 *
 * @example MapPin3Fill <> MapPin3FillProps(size = 24, color = "blue")
 */
def MapPin3Fill = (props: MapPin3FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 19.9451C6.50005 19.4476 3 15.6326 3 11C3 6.02944 7.02944 2 12 2C16.9706 2 21 6.02944 21 11C21 15.6326 17.5 19.4476 13 19.9451V24H11V19.9451Z")
  )
}
