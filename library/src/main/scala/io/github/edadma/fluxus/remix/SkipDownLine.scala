/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SkipDownLine icon from the Remix Icon library, Arrows category.
 */
case class SkipDownLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SkipDownLine icon component.
 *
 * @example SkipDownLine <> SkipDownLineProps(size = 24, color = "blue")
 */
def SkipDownLine = (props: SkipDownLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 10.0858L7.20711 5.29291L5.79289 6.70712L12 12.9142L18.2071 6.70712L16.7929 5.29291L12 10.0858ZM18 17L6 17L6 15L18 15V17Z")
  )
}
