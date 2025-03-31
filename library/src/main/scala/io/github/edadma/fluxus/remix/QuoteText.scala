/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * QuoteText icon from the Remix Icon library, Editor category.
 */
case class QuoteTextProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * QuoteText icon component.
 *
 * @example QuoteText <> QuoteTextProps(size = 24, color = "blue")
 */
def QuoteText = (props: QuoteTextProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 4H3V6H21V4ZM21 11H8V13H21V11ZM21 18H8V20H21V18ZM5 11H3V20H5V11Z")
  )
}
