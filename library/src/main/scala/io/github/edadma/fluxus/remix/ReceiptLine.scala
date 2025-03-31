/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ReceiptLine icon from the Remix Icon library, Document category.
 */
case class ReceiptLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ReceiptLine icon component.
 *
 * @example ReceiptLine <> ReceiptLineProps(size = 24, color = "blue")
 */
def ReceiptLine = (props: ReceiptLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9 4L6 2L3 4V19C3 20.6569 4.34315 22 6 22H20C21.6569 22 23 20.6569 23 19V16H21V4L18 2L15 4L12 2L9 4ZM19 16H7V19C7 19.5523 6.55228 20 6 20C5.44772 20 5 19.5523 5 19V5.07037L6 4.4037L9 6.4037L12 4.4037L15 6.4037L18 4.4037L19 5.07037V16ZM20 20H8.82929C8.93985 19.6872 9 19.3506 9 19V18H21V19C21 19.5523 20.5523 20 20 20Z")
  )
}
