/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * InboxUnarchiveFill icon from the Remix Icon library, Business category.
 */
case class InboxUnarchiveFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * InboxUnarchiveFill icon component.
 *
 * @example InboxUnarchiveFill <> InboxUnarchiveFillProps(size = 24, color = "blue")
 */
def InboxUnarchiveFill = (props: InboxUnarchiveFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 3L22 7V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V7.00353L4 3H20ZM12 10L8 14H11V18H13V14H16L12 10ZM18.764 5H5.236L4.237 7H19.764L18.764 5Z")
  )
}
