/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SkipDownFill icon from the Remix Icon library, Arrows category.
 */
case class SkipDownFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SkipDownFill icon component.
 *
 * @example SkipDownFill <> SkipDownFillProps(size = 24, color = "blue")
 */
def SkipDownFill = (props: SkipDownFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18 17 6 17 6 15 18 15 18 17ZM12 13 18 7H6L12 13Z")
  )
}
