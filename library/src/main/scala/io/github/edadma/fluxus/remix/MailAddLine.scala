/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MailAddLine icon from the Remix Icon library, Business category.
 */
case class MailAddLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MailAddLine icon component.
 *
 * @example MailAddLine <> MailAddLineProps(size = 24, color = "blue")
 */
def MailAddLine = (props: MailAddLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22 13H20V7.23792L12.0718 14.338L4 7.21594V19H14V21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H21C21.5523 3 22 3.44772 22 4V13ZM4.51146 5L12.0619 11.662L19.501 5H4.51146ZM21 18H24V20H21V23H19V20H16V18H19V15H21V18Z")
  )
}
