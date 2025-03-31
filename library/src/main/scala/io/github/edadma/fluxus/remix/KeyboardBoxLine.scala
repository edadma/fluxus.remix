/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * KeyboardBoxLine icon from the Remix Icon library, Device category.
 */
case class KeyboardBoxLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * KeyboardBoxLine icon component.
 *
 * @example KeyboardBoxLine <> KeyboardBoxLineProps(size = 24, color = "blue")
 */
def KeyboardBoxLine = (props: KeyboardBoxLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 5V19H20V5H4ZM3 3H21C21.5523 3 22 3.44772 22 4V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3ZM6 7H8V9H6V7ZM6 11H8V13H6V11ZM6 15H18V17H6V15ZM11 11H13V13H11V11ZM11 7H13V9H11V7ZM16 7H18V9H16V7ZM16 11H18V13H16V11Z")
  )
}
