/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftUpLongLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftUpLongLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftUpLongLine icon component.
 *
 * @example ArrowLeftUpLongLine <> ArrowLeftUpLongLineProps(size = 24, color = "blue")
 */
def ArrowLeftUpLongLine = (props: ArrowLeftUpLongLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19.7784 18.3641L18.3644 19.7783L6.92908 8.34305V13.9288H4.92908L4.92908 4.9288L13.9291 4.9288L13.9291 6.9288L8.34326 6.9288L19.7784 18.3641Z")
  )
}
