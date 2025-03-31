/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowDownLongFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowDownLongFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowDownLongFill icon component.
 *
 * @example ArrowDownLongFill <> ArrowDownLongFillProps(size = 24, color = "blue")
 */
def ArrowDownLongFill = (props: ArrowDownLongFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.9999 1.99974L11 1.9996L11 15.5858H5.58582L12 22L18.4142 15.5858L13 15.5858L12.9999 1.99974Z")
  )
}
