/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Compass2Line icon from the Remix Icon library, Map category.
 */
case class Compass2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Compass2Line icon component.
 *
 * @example Compass2Line <> Compass2LineProps(size = 24, color = "blue")
 */
def Compass2Line = (props: Compass2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16.6248 3.13258L15.1247 4.63267C14.1648 4.22531 13.1088 4 12 4C7.58 4 4 7.58 4 12C4 16.42 7.58 20 12 20C16.42 20 20 16.42 20 12C20 10.8912 19.7747 9.83517 19.3673 8.87531L20.8674 7.37522C21.5908 8.75852 22 10.3318 22 12C22 17.52 17.52 22 12 22C6.48 22 2 17.52 2 12C2 6.48 6.48 2 12 2C13.6682 2 15.2415 2.40918 16.6248 3.13258ZM18.364 4.22183L19.7782 5.63604L12 13.4142L10.5858 12L18.364 4.22183Z")
  )
}
