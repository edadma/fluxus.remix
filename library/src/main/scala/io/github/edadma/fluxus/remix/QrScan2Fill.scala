/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * QrScan2Fill icon from the Remix Icon library, Device category.
 */
case class QrScan2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * QrScan2Fill icon component.
 *
 * @example QrScan2Fill <> QrScan2FillProps(size = 24, color = "blue")
 */
def QrScan2Fill = (props: QrScan2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15 3H21V9H15V3ZM9 3V9H3V3H9ZM15 21V15H21V21H15ZM9 21H3V15H9V21ZM3 11H21V13H3V11Z")
  )
}
