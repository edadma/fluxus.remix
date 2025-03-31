/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SliceFill icon from the Remix Icon library, Design category.
 */
case class SliceFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SliceFill icon component.
 *
 * @example SliceFill <> SliceFillProps(size = 24, color = "blue")
 */
def SliceFill = (props: SliceFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.7678 12.2288L15.8892 14.3501C11.293 18.9463 5.63612 20.3605 2.10059 19.6534L17.6569 4.09705L19.7783 6.21837L13.7678 12.2288Z")
  )
}
