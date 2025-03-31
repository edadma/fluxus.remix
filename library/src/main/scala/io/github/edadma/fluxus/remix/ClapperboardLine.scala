/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ClapperboardLine icon from the Remix Icon library, Media category.
 */
case class ClapperboardLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ClapperboardLine icon component.
 *
 * @example ClapperboardLine <> ClapperboardLineProps(size = 24, color = "blue")
 */
def ClapperboardLine = (props: ClapperboardLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5.99807 7L8.30747 3H11.9981L9.68867 7H5.99807ZM11.9981 7L14.3075 3H17.9981L15.6887 7H11.9981ZM17.9981 7L20.3075 3H21.0082C21.556 3 22 3.44495 22 3.9934V20.0066C22 20.5552 21.5447 21 21.0082 21H2.9918C2.44405 21 2 20.5551 2 20.0066V3.9934C2 3.44476 2.45531 3 2.9918 3H5.99807L4 6.46076V19H20V7H17.9981Z")
  )
}
