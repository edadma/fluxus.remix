/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PentagonFill icon from the Remix Icon library, Design category.
 */
case class PentagonFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PentagonFill icon component.
 *
 * @example PentagonFill <> PentagonFillProps(size = 24, color = "blue")
 */
def PentagonFill = (props: PentagonFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.0004 0.700195L22.7473 8.5083L18.6423 21.1421H5.35838L1.25342 8.5083L12.0004 0.700195Z")
  )
}
