/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MapPinRangeLine icon from the Remix Icon library, Map category.
 */
case class MapPinRangeLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MapPinRangeLine icon component.
 *
 * @example MapPinRangeLine <> MapPinRangeLineProps(size = 24, color = "blue")
 */
def MapPinRangeLine = (props: MapPinRangeLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 17.9381C7.05369 17.446 4 14.0796 4 10C4 5.58172 7.58172 2 12 2C16.4183 2 20 5.58172 20 10C20 14.0796 16.9463 17.446 13 17.9381V20.0116C16.9463 20.1039 20 20.7351 20 21.5C20 22.3284 16.4183 23 12 23C7.58172 23 4 22.3284 4 21.5C4 20.7351 7.05369 20.1039 11 20.0116V17.9381ZM12 16C15.3137 16 18 13.3137 18 10C18 6.68629 15.3137 4 12 4C8.68629 4 6 6.68629 6 10C6 13.3137 8.68629 16 12 16ZM12 12C10.8954 12 10 11.1046 10 10C10 8.89543 10.8954 8 12 8C13.1046 8 14 8.89543 14 10C14 11.1046 13.1046 12 12 12Z")
  )
}
