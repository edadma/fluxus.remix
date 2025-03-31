/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandRightFill icon from the Remix Icon library, Arrows category.
 */
case class ExpandRightFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandRightFill icon component.
 *
 * @example ExpandRightFill <> ExpandRightFillProps(size = 24, color = "blue")
 */
def ExpandRightFill = (props: ExpandRightFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.9998 4.99988L21.0001 11.9999L13.9998 18.9999V13.0001H7.9998L7.99978 11.0001H13.9998V4.99988ZM3.99985 18.9999L3.99985 4.99988H5.99985V18.9999H3.99985Z")
  )
}
