/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PlayListAddFill icon from the Remix Icon library, Media category.
 */
case class PlayListAddFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PlayListAddFill icon component.
 *
 * @example PlayListAddFill <> PlayListAddFillProps(size = 24, color = "blue")
 */
def PlayListAddFill = (props: PlayListAddFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 18H12V20H2V18ZM2 11H22V13H2V11ZM2 4H22V6H2V4ZM18 18V15H20V18H23V20H20V23H18V20H15V18H18Z")
  )
}
