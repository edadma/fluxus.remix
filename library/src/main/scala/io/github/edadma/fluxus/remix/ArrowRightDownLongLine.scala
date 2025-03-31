/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowRightDownLongLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowRightDownLongLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowRightDownLongLine icon component.
 *
 * @example ArrowRightDownLongLine <> ArrowRightDownLongLineProps(size = 24, color = "blue")
 */
def ArrowRightDownLongLine = (props: ArrowRightDownLongLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.2216 5.63589L5.63562 4.22168L17.0709 15.6569V10.0712H19.0709L19.0709 19.0712L10.0709 19.0712L10.0709 17.0712L15.6567 17.0712L4.2216 5.63589Z")
  )
}
