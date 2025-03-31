/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TriangularFlagLine icon from the Remix Icon library, Business category.
 */
case class TriangularFlagLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TriangularFlagLine icon component.
 *
 * @example TriangularFlagLine <> TriangularFlagLineProps(size = 24, color = "blue")
 */
def TriangularFlagLine = (props: TriangularFlagLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6 5.1438V16.0002H18.3391L6 5.1438ZM4 2.932C4 2.07155 5.01456 1.61285 5.66056 2.18123L21.6501 16.2494C22.3423 16.8584 21.9116 18.0002 20.9896 18.0002H6V22H4V2.932Z")
  )
}
