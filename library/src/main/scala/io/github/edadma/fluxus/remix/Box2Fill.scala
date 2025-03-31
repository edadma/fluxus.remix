/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Box2Fill icon from the Remix Icon library, Others category.
 */
case class Box2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Box2Fill icon component.
 *
 * @example Box2Fill <> Box2FillProps(size = 24, color = "blue")
 */
def Box2Fill = (props: Box2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 1L21.5 6.5V17.5L12 23L2.5 17.5V6.5L12 1ZM4.5 7.65788V16.3469L12 20.689V12L4.5 7.65788Z")
  )
}
