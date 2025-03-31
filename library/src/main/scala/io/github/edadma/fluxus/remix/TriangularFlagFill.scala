/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TriangularFlagFill icon from the Remix Icon library, Business category.
 */
case class TriangularFlagFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TriangularFlagFill icon component.
 *
 * @example TriangularFlagFill <> TriangularFlagFillProps(size = 24, color = "blue")
 */
def TriangularFlagFill = (props: TriangularFlagFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5.66056 2.18123C5.01456 1.61285 4 2.07155 4 2.932V22H6V18.0002H20.9896C21.9116 18.0002 22.3423 16.8584 21.6501 16.2494L5.66056 2.18123Z")
  )
}
