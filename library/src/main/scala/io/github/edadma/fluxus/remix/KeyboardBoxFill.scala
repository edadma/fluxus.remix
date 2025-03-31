/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * KeyboardBoxFill icon from the Remix Icon library, Device category.
 */
case class KeyboardBoxFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * KeyboardBoxFill icon component.
 *
 * @example KeyboardBoxFill <> KeyboardBoxFillProps(size = 24, color = "blue")
 */
def KeyboardBoxFill = (props: KeyboardBoxFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 3H21C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3ZM5 7V9H7V7H5ZM5 11V13H7V11H5ZM5 15V17H19V15H5ZM9 11V13H11V11H9ZM9 7V9H11V7H9ZM13 7V9H15V7H13ZM17 7V9H19V7H17ZM13 11V13H15V11H13ZM17 11V13H19V11H17Z")
  )
}
