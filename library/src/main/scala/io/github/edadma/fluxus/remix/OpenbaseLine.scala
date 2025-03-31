/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * OpenbaseLine icon from the Remix Icon library, Logos category.
 */
case class OpenbaseLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * OpenbaseLine icon component.
 *
 * @example OpenbaseLine <> OpenbaseLineProps(size = 24, color = "blue")
 */
def OpenbaseLine = (props: OpenbaseLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 3L2 5.996L3 15.46L12 22.5L21 15.46L22 5.996L12 3ZM19.8367 7.43572L12 19.9608L4.16326 7.43572L12 5.08783L19.8367 7.43572Z")
  )
}
