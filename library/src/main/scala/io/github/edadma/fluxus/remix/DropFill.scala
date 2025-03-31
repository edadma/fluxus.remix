/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DropFill icon from the Remix Icon library, Design category.
 */
case class DropFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DropFill icon component.
 *
 * @example DropFill <> DropFillProps(size = 24, color = "blue")
 */
def DropFill = (props: DropFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5.63604 6.63288L12 0.268921L18.364 6.63288C21.8787 10.1476 21.8787 15.8461 18.364 19.3608C14.8492 22.8755 9.15076 22.8755 5.63604 19.3608C2.12132 15.8461 2.12132 10.1476 5.63604 6.63288H5.63604Z")
  )
}
