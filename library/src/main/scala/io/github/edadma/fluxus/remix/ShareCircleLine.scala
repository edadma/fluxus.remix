/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ShareCircleLine icon from the Remix Icon library, System category.
 */
case class ShareCircleLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ShareCircleLine icon component.
 *
 * @example ShareCircleLine <> ShareCircleLineProps(size = 24, color = "blue")
 */
def ShareCircleLine = (props: ShareCircleLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 2.04938V4.06189C7.05369 4.55399 4 7.92038 4 12C4 16.4183 7.58172 20 12 20C16.0796 20 19.446 16.9463 19.9381 13H21.9506C21.4489 18.0533 17.1853 22 12 22C6.47715 22 2 17.5228 2 12C2 6.81465 5.94668 2.5511 11 2.04938ZM20 5.41421L12 13.4142L10.5858 12L18.5858 4H14V2H22V10H20V5.41421Z")
  )
}
