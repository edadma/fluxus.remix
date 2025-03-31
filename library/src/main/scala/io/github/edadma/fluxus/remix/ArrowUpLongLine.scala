/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowUpLongLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowUpLongLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowUpLongLine icon component.
 *
 * @example ArrowUpLongLine <> ArrowUpLongLineProps(size = 24, color = "blue")
 */
def ArrowUpLongLine = (props: ArrowUpLongLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.0001 22.0003L11.0002 22.0004L11.0002 5.82845L7.05044 9.77817L5.63623 8.36396L12.0002 2L18.3642 8.36396L16.9499 9.77817L13.0002 5.8284L13.0001 22.0003Z")
  )
}
