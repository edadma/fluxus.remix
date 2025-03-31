/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SortAlphabetAsc icon from the Remix Icon library, Editor category.
 */
case class SortAlphabetAscProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SortAlphabetAsc icon component.
 *
 * @example SortAlphabetAsc <> SortAlphabetAscProps(size = 24, color = "blue")
 */
def SortAlphabetAsc = (props: SortAlphabetAscProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.86885 11H2.6665L6 3H8L11.3334 11H9.13113L8.7213 10H5.27869L4.86885 11ZM6.09836 8H7.90163L7 5.8L6.09836 8ZM18.9999 16V3H16.9999V16H13.9999L17.9999 21L21.9999 16H18.9999ZM10.9999 13H2.99992V15H7.85414L2.99992 19V21H10.9999V19H6.14605L10.9999 15V13Z")
  )
}
