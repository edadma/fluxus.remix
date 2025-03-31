/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Loader5Line icon from the Remix Icon library, System category.
 */
case class Loader5LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Loader5Line icon component.
 *
 * @example Loader5Line <> Loader5LineProps(size = 24, color = "blue")
 */
def Loader5Line = (props: Loader5LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 3C16.9706 3 21 7.02944 21 12H19C19 8.13401 15.866 5 12 5V3Z")
  )
}
