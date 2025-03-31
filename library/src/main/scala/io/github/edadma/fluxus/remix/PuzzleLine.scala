/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PuzzleLine icon from the Remix Icon library, Development category.
 */
case class PuzzleLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PuzzleLine icon component.
 *
 * @example PuzzleLine <> PuzzleLineProps(size = 24, color = "blue")
 */
def PuzzleLine = (props: PuzzleLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 5C7 2.79086 8.79086 1 11 1C13.2091 1 15 2.79086 15 5H18C18.5523 5 19 5.44772 19 6V9C21.2091 9 23 10.7909 23 13C23 15.2091 21.2091 17 19 17V20C19 20.5523 18.5523 21 18 21H4C3.44772 21 3 20.5523 3 20V6C3 5.44772 3.44772 5 4 5H7ZM11 3C9.89543 3 9 3.89543 9 5C9 5.23554 9.0403 5.45952 9.11355 5.66675C9.22172 5.97282 9.17461 6.31235 8.98718 6.57739C8.79974 6.84243 8.49532 7 8.17071 7H5V19H17V15.8293C17 15.5047 17.1576 15.2003 17.4226 15.0128C17.6877 14.8254 18.0272 14.7783 18.3332 14.8865C18.5405 14.9597 18.7645 15 19 15C20.1046 15 21 14.1046 21 13C21 11.8954 20.1046 11 19 11C18.7645 11 18.5405 11.0403 18.3332 11.1135C18.0272 11.2217 17.6877 11.1746 17.4226 10.9872C17.1576 10.7997 17 10.4953 17 10.1707V7H13.8293C13.5047 7 13.2003 6.84243 13.0128 6.57739C12.8254 6.31235 12.7783 5.97282 12.8865 5.66675C12.9597 5.45952 13 5.23555 13 5C13 3.89543 12.1046 3 11 3Z")
  )
}
