/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * AddLargeFill icon from the Remix Icon library, System category.
 */
case class AddLargeFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * AddLargeFill icon component.
 *
 * @example AddLargeFill <> AddLargeFillProps(size = 24, color = "blue")
 */
def AddLargeFill = (props: AddLargeFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 11.0001L11 2.0005L13 2.00049L13 11.0001L22.0001 10.9999L22.0002 12.9999L13 13.0001L13.0001 22L11.0001 22L11.0001 13.0001L2.00004 13.0003L2 11.0003L11 11.0001Z")
  )
}
