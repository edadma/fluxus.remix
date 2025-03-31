/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowDownLongLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowDownLongLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowDownLongLine icon component.
 *
 * @example ArrowDownLongLine <> ArrowDownLongLineProps(size = 24, color = "blue")
 */
def ArrowDownLongLine = (props: ArrowDownLongLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.0001 1.99974L11.0002 1.9996L11.0002 18.1715L7.05044 14.2218L5.63623 15.636L12.0002 22L18.3642 15.636L16.9499 14.2218L13.0002 18.1716L13.0001 1.99974Z")
  )
}
