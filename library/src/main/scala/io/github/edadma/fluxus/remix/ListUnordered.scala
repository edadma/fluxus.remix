/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ListUnordered icon from the Remix Icon library, Editor category.
 */
case class ListUnorderedProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ListUnordered icon component.
 *
 * @example ListUnordered <> ListUnorderedProps(size = 24, color = "blue")
 */
def ListUnordered = (props: ListUnorderedProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8 4H21V6H8V4ZM4.5 6.5C3.67157 6.5 3 5.82843 3 5C3 4.17157 3.67157 3.5 4.5 3.5C5.32843 3.5 6 4.17157 6 5C6 5.82843 5.32843 6.5 4.5 6.5ZM4.5 13.5C3.67157 13.5 3 12.8284 3 12C3 11.1716 3.67157 10.5 4.5 10.5C5.32843 10.5 6 11.1716 6 12C6 12.8284 5.32843 13.5 4.5 13.5ZM4.5 20.4C3.67157 20.4 3 19.7284 3 18.9C3 18.0716 3.67157 17.4 4.5 17.4C5.32843 17.4 6 18.0716 6 18.9C6 19.7284 5.32843 20.4 4.5 20.4ZM8 11H21V13H8V11ZM8 18H21V20H8V18Z")
  )
}
