/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Space icon from the Remix Icon library, Editor category.
 */
case class SpaceProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Space icon component.
 *
 * @example Space <> SpaceProps(size = 24, color = "blue")
 */
def Space = (props: SpaceProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 9V13H20V9H22V14C22 14.5523 21.5523 15 21 15H3C2.44772 15 2 14.5523 2 14V9H4Z")
  )
}
