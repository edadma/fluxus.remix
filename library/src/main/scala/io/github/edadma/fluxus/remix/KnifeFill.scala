/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * KnifeFill icon from the Remix Icon library, Food category.
 */
case class KnifeFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * KnifeFill icon component.
 *
 * @example KnifeFill <> KnifeFillProps(size = 24, color = "blue")
 */
def KnifeFill = (props: KnifeFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22.3744 19.4394C22.9602 20.0252 22.9602 20.975 22.3744 21.5607C21.7886 22.1465 20.8388 22.1465 20.253 21.5607L15.6569 16.9646L12.1213 20.5001L4.34315 12.7219C1.2779 9.65666 1.22006 4.72285 4.16964 1.58709L4.34315 1.4082L22.3744 19.4394Z")
  )
}
