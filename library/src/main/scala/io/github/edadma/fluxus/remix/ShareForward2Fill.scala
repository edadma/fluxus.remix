/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ShareForward2Fill icon from the Remix Icon library, System category.
 */
case class ShareForward2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ShareForward2Fill icon component.
 *
 * @example ShareForward2Fill <> ShareForward2FillProps(size = 24, color = "blue")
 */
def ShareForward2Fill = (props: ShareForward2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 19H20V14H22V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V14H4V19ZM12 10H9C7.00442 10 5.23638 10.9742 4.14556 12.473C4.85831 8.78512 8.10391 6 12 6V2L20 8L12 14V10Z")
  )
}
