/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * EmotionHappyFill icon from the Remix Icon library, User & Faces category.
 */
case class EmotionHappyFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * EmotionHappyFill icon component.
 *
 * @example EmotionHappyFill <> EmotionHappyFillProps(size = 24, color = "blue")
 */
def EmotionHappyFill = (props: EmotionHappyFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22ZM7 13C7 15.7614 9.23858 18 12 18C14.7614 18 17 15.7614 17 13H15C15 14.6569 13.6569 16 12 16C10.3431 16 9 14.6569 9 13H7ZM8 11C8.82843 11 9.5 10.3284 9.5 9.5C9.5 8.67157 8.82843 8 8 8C7.17157 8 6.5 8.67157 6.5 9.5C6.5 10.3284 7.17157 11 8 11ZM16 11C16.8284 11 17.5 10.3284 17.5 9.5C17.5 8.67157 16.8284 8 16 8C15.1716 8 14.5 8.67157 14.5 9.5C14.5 10.3284 15.1716 11 16 11Z")
  )
}
