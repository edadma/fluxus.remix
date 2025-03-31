/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandDiagonal2Line icon from the Remix Icon library, Arrows category.
 */
case class ExpandDiagonal2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandDiagonal2Line icon component.
 *
 * @example ExpandDiagonal2Line <> ExpandDiagonal2LineProps(size = 24, color = "blue")
 */
def ExpandDiagonal2Line = (props: ExpandDiagonal2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6.41421 5H10V3H3V10H5V6.41421L9.29289 10.7071L10.7071 9.29289L6.41421 5ZM21 14H19V17.5858L14.7071 13.2929L13.2929 14.7071L17.5858 19H14V21H21V14Z")
  )
}
