/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ContactsBook3Fill icon from the Remix Icon library, Document category.
 */
case class ContactsBook3FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ContactsBook3Fill icon component.
 *
 * @example ContactsBook3Fill <> ContactsBook3FillProps(size = 24, color = "blue")
 */
def ContactsBook3Fill = (props: ContactsBook3FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 2C3.44772 2 3 2.44772 3 3V5H5V7H2V9H5V11H2V13H5V15H2V17H5V19H3V21C3 21.5523 3.44772 22 4 22H20C20.5523 22 21 21.5523 21 21V3C21 2.44772 20.5523 2 20 2H4ZM9 16C9 14.3431 10.3431 13 12 13C13.6569 13 15 14.3431 15 16H9ZM12 12C10.8954 12 10 11.1046 10 10C10 8.89543 10.8954 8 12 8C13.1046 8 14 8.89543 14 10C14 11.1046 13.1046 12 12 12Z")
  )
}
