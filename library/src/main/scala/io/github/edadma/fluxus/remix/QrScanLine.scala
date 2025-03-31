/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * QrScanLine icon from the Remix Icon library, Device category.
 */
case class QrScanLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * QrScanLine icon component.
 *
 * @example QrScanLine <> QrScanLineProps(size = 24, color = "blue")
 */
def QrScanLine = (props: QrScanLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 16V21H3V16H5V19H19V16H21ZM3 11H21V13H3V11ZM21 8H19V5H5V8H3V3H21V8Z")
  )
}
