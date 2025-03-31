/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowRightUpLongLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowRightUpLongLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowRightUpLongLine icon component.
 *
 * @example ArrowRightUpLongLine <> ArrowRightUpLongLineProps(size = 24, color = "blue")
 */
def ArrowRightUpLongLine = (props: ArrowRightUpLongLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5.63589 19.7784L4.22169 18.3644L15.657 6.92908L10.0712 6.92908V4.92908L19.0712 4.92908L19.0712 13.9291H17.0712L17.0712 8.34326L5.63589 19.7784Z")
  )
}
