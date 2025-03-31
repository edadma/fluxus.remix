/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Building3Line icon from the Remix Icon library, Buildings category.
 */
case class Building3LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Building3Line icon component.
 *
 * @example Building3Line <> Building3LineProps(size = 24, color = "blue")
 */
def Building3Line = (props: Building3LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10 10.1111V1L21 7V21H3V7L10 10.1111ZM12 4.36908V13.1886L5 10.0775V19H19V8.18727L12 4.36908Z")
  )
}
