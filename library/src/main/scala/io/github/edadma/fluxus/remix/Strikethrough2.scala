/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Strikethrough2 icon from the Remix Icon library, Editor category.
 */
case class Strikethrough2Props(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Strikethrough2 icon component.
 *
 * @example Strikethrough2 <> Strikethrough2Props(size = 24, color = "blue")
 */
def Strikethrough2 = (props: Strikethrough2Props) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 9H11V6H5V4H19V6H13V9ZM13 15V20H11V15H13ZM3 11H21V13H3V11Z")
  )
}
