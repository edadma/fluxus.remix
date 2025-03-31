/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FlagLine icon from the Remix Icon library, Business category.
 */
case class FlagLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FlagLine icon component.
 *
 * @example FlagLine <> FlagLineProps(size = 24, color = "blue")
 */
def FlagLine = (props: FlagLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.382 3C12.7607 3 13.107 3.214 13.2764 3.55279L14 5H20C20.5523 5 21 5.44772 21 6V17C21 17.5523 20.5523 18 20 18H13.618C13.2393 18 12.893 17.786 12.7236 17.4472L12 16H5V22H3V3H12.382ZM11.7639 5H5V14H13.2361L14.2361 16H19V7H12.7639L11.7639 5Z")
  )
}
