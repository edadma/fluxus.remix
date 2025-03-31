/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowRightUpLongFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowRightUpLongFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowRightUpLongFill icon component.
 *
 * @example ArrowRightUpLongFill <> ArrowRightUpLongFillProps(size = 24, color = "blue")
 */
def ArrowRightUpLongFill = (props: ArrowRightUpLongFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.22173 18.3642L5.63574 19.7784L15.2427 10.1716L19.071 14L19.071 4.92892L9.99999 4.92893L13.8284 8.75738L4.22173 18.3642Z")
  )
}
