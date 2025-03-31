/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ScanFill icon from the Remix Icon library, Device category.
 */
case class ScanFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ScanFill icon component.
 *
 * @example ScanFill <> ScanFillProps(size = 24, color = "blue")
 */
def ScanFill = (props: ScanFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.25705 5.67127L12 13.4142L13.4142 12L5.67127 4.25705C7.39514 2.84637 9.59873 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 9.59873 2.84637 7.39514 4.25705 5.67127Z")
  )
}
