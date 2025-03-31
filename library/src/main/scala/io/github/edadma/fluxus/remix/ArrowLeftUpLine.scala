/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftUpLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftUpLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftUpLine icon component.
 *
 * @example ArrowLeftUpLine <> ArrowLeftUpLineProps(size = 24, color = "blue")
 */
def ArrowLeftUpLine = (props: ArrowLeftUpLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9.41421 8L18.0208 16.6066L16.6066 18.0208L8 9.41421V17H6V6H17V8H9.41421Z")
  )
}
