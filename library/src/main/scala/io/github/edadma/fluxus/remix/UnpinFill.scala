/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * UnpinFill icon from the Remix Icon library, Map category.
 */
case class UnpinFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * UnpinFill icon component.
 *
 * @example UnpinFill <> UnpinFillProps(size = 24, color = "blue")
 */
def UnpinFill = (props: UnpinFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20.9711 17.1715 19.5568 18.5858 16.0223 15.0513 15.9486 15.125 15.2415 18.6605 13.8273 20.0747 9.58466 15.8321 4.63492 20.7818 3.2207 19.3676 8.17045 14.4179 3.92781 10.1752 5.34202 8.76101 8.87756 8.0539 8.95127 7.98019 5.4147 4.44362 6.82892 3.02941 20.9711 17.1715ZM18.8508 12.2228 20.1913 10.8823 20.8984 11.5894 22.3126 10.1752 13.8273 1.68994 12.4131 3.10416 13.1202 3.81126 11.7797 5.15176 18.8508 12.2228Z")
  )
}
