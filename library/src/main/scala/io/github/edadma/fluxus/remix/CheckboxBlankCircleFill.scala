/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CheckboxBlankCircleFill icon from the Remix Icon library, System category.
 */
case class CheckboxBlankCircleFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CheckboxBlankCircleFill icon component.
 *
 * @example CheckboxBlankCircleFill <> CheckboxBlankCircleFillProps(size = 24, color = "blue")
 */
def CheckboxBlankCircleFill = (props: CheckboxBlankCircleFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 22C17.5228 22 22 17.5228 22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22Z")
  )
}
