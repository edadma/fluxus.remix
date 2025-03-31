/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PixelfedLine icon from the Remix Icon library, Logos category.
 */
case class PixelfedLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PixelfedLine icon component.
 *
 * @example PixelfedLine <> PixelfedLineProps(size = 24, color = "blue")
 */
def PixelfedLine = (props: PixelfedLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.001 2C17.5238 2 22.001 6.47715 22.001 12C22.001 17.5228 17.5238 22 12.001 22C6.47813 22 2.00098 17.5228 2.00098 12C2.00098 6.47715 6.47813 2 12.001 2ZM12.001 4C7.5827 4 4.00098 7.58172 4.00098 12C4.00098 16.4183 7.5827 20 12.001 20C16.4193 20 20.001 16.4183 20.001 12C20.001 7.58172 16.4193 4 12.001 4ZM13.0322 8.09865C14.7448 8.09865 16.1331 9.44411 16.1331 11.1038C16.1331 12.7635 14.7448 14.109 13.0322 14.109H11.2143L8.61941 16.5804V9.83241C8.61941 8.87488 9.42035 8.09865 10.4084 8.09865H13.0322Z")
  )
}
