/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * QrCodeLine icon from the Remix Icon library, Device category.
 */
case class QrCodeLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * QrCodeLine icon component.
 *
 * @example QrCodeLine <> QrCodeLineProps(size = 24, color = "blue")
 */
def QrCodeLine = (props: QrCodeLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 17V16H13V13H16V15H18V17H17V19H15V21H13V18H15V17H16ZM21 21H17V19H19V17H21V21ZM3 3H11V11H3V3ZM5 5V9H9V5H5ZM13 3H21V11H13V3ZM15 5V9H19V5H15ZM3 13H11V21H3V13ZM5 15V19H9V15H5ZM18 13H21V15H18V13ZM6 6H8V8H6V6ZM6 16H8V18H6V16ZM16 6H18V8H16V6Z")
  )
}
