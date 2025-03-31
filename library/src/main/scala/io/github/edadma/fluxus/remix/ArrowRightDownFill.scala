/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowRightDownFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowRightDownFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowRightDownFill icon component.
 *
 * @example ArrowRightDownFill <> ArrowRightDownFillProps(size = 24, color = "blue")
 */
def ArrowRightDownFill = (props: ArrowRightDownFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11.6366 13.0515L5.97974 7.39468L7.39395 5.98047L13.0508 11.6373L18.0006 6.68758V18.0013H6.68684L11.6366 13.0515Z")
  )
}
