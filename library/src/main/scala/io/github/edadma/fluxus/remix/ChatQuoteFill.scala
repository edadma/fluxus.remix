/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ChatQuoteFill icon from the Remix Icon library, Communication category.
 */
case class ChatQuoteFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ChatQuoteFill icon component.
 *
 * @example ChatQuoteFill <> ChatQuoteFillProps(size = 24, color = "blue")
 */
def ChatQuoteFill = (props: ChatQuoteFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 3C21.5523 3 22 3.44772 22 4V18C22 18.5523 21.5523 19 21 19H6.455L2 22.5V4C2 3.44772 2.44772 3 3 3H21ZM10.5153 7.4116C8.72825 8.18684 7.5 9.75543 7.5 11.5052C7.5 12.5 7.77658 13.1137 8.29171 13.6605C8.61598 14.0048 9.12905 14.25 9.66558 14.25C10.6321 14.25 11.4156 13.4665 11.4156 12.5C11.4156 11.5795 10.7045 10.8389 9.80236 10.7553C9.64107 10.7403 9.47827 10.7431 9.32317 10.7645L9.32344 10.6729C9.32873 10.2322 9.4223 8.9333 10.9616 8.1004L10.5153 7.4116ZM15.5153 7.4116C13.7283 8.18684 12.5 9.75543 12.5 11.5052C12.5 12.5 12.7766 13.1137 13.2917 13.6605C13.616 14.0048 14.1291 14.25 14.6656 14.25C15.6321 14.25 16.4156 13.4665 16.4156 12.5C16.4156 11.5795 15.7045 10.8389 14.8024 10.7553C14.6411 10.7403 14.4783 10.7431 14.3232 10.7645L14.3234 10.6729C14.3287 10.2322 14.4223 8.9333 15.9616 8.1004L15.5153 7.4116Z")
  )
}
