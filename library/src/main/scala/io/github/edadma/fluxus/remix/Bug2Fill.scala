/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Bug2Fill icon from the Remix Icon library, Development category.
 */
case class Bug2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Bug2Fill icon component.
 *
 * @example Bug2Fill <> Bug2FillProps(size = 24, color = "blue")
 */
def Bug2Fill = (props: Bug2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5.07089 16C5.02417 15.6734 5 15.3395 5 15V14H3V12H5V11C5 10.6605 5.02417 10.3266 5.07089 10H3V8.00001H5.67363C6.28647 6.70996 7.28227 5.6371 8.51412 4.92834L7.46447 3.87869L8.87868 2.46448L10.5621 4.14785C11.0262 4.05095 11.5071 4.00001 12 4.00001C12.4929 4.00001 12.9738 4.05095 13.4379 4.14785L15.1213 2.46448L16.5355 3.87869L15.4859 4.92834C16.7177 5.6371 17.7135 6.70996 18.3264 8.00001H21V10H18.9291C18.9758 10.3266 19 10.6605 19 11V12H21V14H19V15C19 15.3395 18.9758 15.6734 18.9291 16H21V18H18.3264C17.2029 20.365 14.7924 22 12 22C9.2076 22 6.7971 20.365 5.67363 18H3V16H5.07089ZM9 10V12H15V10H9ZM9 14V16H15V14H9Z")
  )
}
