/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TrademarkLine icon from the Remix Icon library, Business category.
 */
case class TrademarkLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TrademarkLine icon component.
 *
 * @example TrademarkLine <> TrademarkLineProps(size = 24, color = "blue")
 */
def TrademarkLine = (props: TrademarkLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10 6V8H6V18H4V8H0V6H10ZM12 6H14.5L17.4999 11.196L20.5 6H23V18H21V9.133L17.4999 15.196L14 9.135V18H12V6Z")
  )
}
