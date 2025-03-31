/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * InboxArchiveFill icon from the Remix Icon library, Business category.
 */
case class InboxArchiveFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * InboxArchiveFill icon component.
 *
 * @example InboxArchiveFill <> InboxArchiveFillProps(size = 24, color = "blue")
 */
def InboxArchiveFill = (props: InboxArchiveFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 3H20L22 7V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V7.00353L4 3ZM13 14V10H11V14H8L12 18L16 14H13ZM19.7639 7L18.7639 5H5.23656L4.23744 7H19.7639Z")
  )
}
