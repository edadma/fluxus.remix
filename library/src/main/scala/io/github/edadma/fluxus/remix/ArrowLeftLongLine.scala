/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftLongLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftLongLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftLongLine icon component.
 *
 * @example ArrowLeftLongLine <> ArrowLeftLongLineProps(size = 24, color = "blue")
 */
def ArrowLeftLongLine = (props: ArrowLeftLongLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22.0003 13.0001L22.0004 11.0002L5.82845 11.0002L9.77817 7.05044L8.36396 5.63623L2 12.0002L8.36396 18.3642L9.77817 16.9499L5.8284 13.0002L22.0003 13.0001Z")
  )
}
