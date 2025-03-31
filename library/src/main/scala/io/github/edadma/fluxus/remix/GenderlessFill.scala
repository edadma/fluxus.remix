/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * GenderlessFill icon from the Remix Icon library, User & Faces category.
 */
case class GenderlessFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * GenderlessFill icon component.
 *
 * @example GenderlessFill <> GenderlessFillProps(size = 24, color = "blue")
 */
def GenderlessFill = (props: GenderlessFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 7.06609V1H13V7.06609C16.6694 7.55498 19.5 10.6969 19.5 14.5C19.5 18.6421 16.1421 22 12 22C7.85786 22 4.5 18.6421 4.5 14.5C4.5 10.6969 7.33064 7.55498 11 7.06609Z")
  )
}
