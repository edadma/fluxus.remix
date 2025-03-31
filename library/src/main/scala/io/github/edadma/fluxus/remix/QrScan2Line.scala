/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * QrScan2Line icon from the Remix Icon library, Device category.
 */
case class QrScan2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * QrScan2Line icon component.
 *
 * @example QrScan2Line <> QrScan2LineProps(size = 24, color = "blue")
 */
def QrScan2Line = (props: QrScan2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15 3H21V8H19V5H15V3ZM9 3V5H5V8H3V3H9ZM15 21V19H19V16H21V21H15ZM9 21H3V16H5V19H9V21ZM3 11H21V13H3V11Z")
  )
}
