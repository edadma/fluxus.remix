/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftDownLongLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftDownLongLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftDownLongLine icon component.
 *
 * @example ArrowLeftDownLongLine <> ArrowLeftDownLongLineProps(size = 24, color = "blue")
 */
def ArrowLeftDownLongLine = (props: ArrowLeftDownLongLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19.7784 5.63589L18.3644 4.22168L6.92908 15.6569L6.92908 10.0712H4.92908L4.92908 19.0712L13.9291 19.0712V17.0712L8.34326 17.0712L19.7784 5.63589Z")
  )
}
