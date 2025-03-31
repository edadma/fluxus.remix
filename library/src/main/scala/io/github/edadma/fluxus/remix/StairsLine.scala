/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * StairsLine icon from the Remix Icon library, Others category.
 */
case class StairsLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * StairsLine icon component.
 *
 * @example StairsLine <> StairsLineProps(size = 24, color = "blue")
 */
def StairsLine = (props: StairsLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15 3H21V21H3V15H7V11H11V7H15V3ZM17 5V9H13V13H9V17H5V19H19V5H17Z")
  )
}
