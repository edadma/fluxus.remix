/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Archive2Fill icon from the Remix Icon library, Business category.
 */
case class Archive2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Archive2Fill icon component.
 *
 * @example Archive2Fill <> Archive2FillProps(size = 24, color = "blue")
 */
def Archive2Fill = (props: Archive2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22 20V7L20 3H4L2 7.00353V20C2 20.5523 2.44772 21 3 21H21C21.5523 21 22 20.5523 22 20ZM5.23582 5H18.7638L19.7638 7H4.23682L5.23582 5ZM9 11H15V13H9V11Z")
  )
}
