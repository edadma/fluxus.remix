/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PatreonLine icon from the Remix Icon library, Logos category.
 */
case class PatreonLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PatreonLine icon component.
 *
 * @example PatreonLine <> PatreonLineProps(size = 24, color = "blue")
 */
def PatreonLine = (props: PatreonLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.001 17C10.8588 17 7.50098 13.6421 7.50098 9.5C7.50098 5.35786 10.8588 2 15.001 2C19.1431 2 22.501 5.35786 22.501 9.5C22.501 13.6421 19.1431 17 15.001 17ZM15.001 15C18.0385 15 20.501 12.5376 20.501 9.5C20.501 6.46243 18.0385 4 15.001 4C11.9634 4 9.50098 6.46243 9.50098 9.5C9.50098 12.5376 11.9634 15 15.001 15ZM2.00098 2H7.00098V22H2.00098V2ZM4.00098 4V20H5.00098V4H4.00098Z")
  )
}
