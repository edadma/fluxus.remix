/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CreativeCommonsNdLine icon from the Remix Icon library, Business category.
 */
case class CreativeCommonsNdLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CreativeCommonsNdLine icon component.
 *
 * @example CreativeCommonsNdLine <> CreativeCommonsNdLineProps(size = 24, color = "blue")
 */
def CreativeCommonsNdLine = (props: CreativeCommonsNdLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8 9H16V11H8V9ZM8 15V13H16V15H8ZM2 12C2 6.47717 6.47717 2 12 2 17.5228 2 22 6.47717 22 12 22 17.5228 17.5228 22 12 22 6.47717 22 2 17.5228 2 12ZM12 4C7.58167 4 4 7.58167 4 12 4 16.4183 7.58167 20 12 20 16.4183 20 20 16.4183 20 12 20 7.58167 16.4183 4 12 4Z")
  )
}
