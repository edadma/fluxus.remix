/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MapPin3Line icon from the Remix Icon library, Map category.
 */
case class MapPin3LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MapPin3Line icon component.
 *
 * @example MapPin3Line <> MapPin3LineProps(size = 24, color = "blue")
 */
def MapPin3Line = (props: MapPin3LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 19.9451C6.50005 19.4476 3 15.6326 3 11C3 6.02944 7.02944 2 12 2C16.9706 2 21 6.02944 21 11C21 15.6326 17.5 19.4476 13 19.9451V24H11V19.9451ZM12 18C15.866 18 19 14.866 19 11C19 7.13401 15.866 4 12 4C8.13401 4 5 7.13401 5 11C5 14.866 8.13401 18 12 18Z")
  )
}
