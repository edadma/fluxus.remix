/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SoundModuleFill icon from the Remix Icon library, Media category.
 */
case class SoundModuleFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SoundModuleFill icon component.
 *
 * @example SoundModuleFill <> SoundModuleFillProps(size = 24, color = "blue")
 */
def SoundModuleFill = (props: SoundModuleFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 18V21H19V18H17V15H23V18H21ZM5 18V21H3V18H1V15H7V18H5ZM11 6V3H13V6H15V9H9V6H11ZM11 11H13V21H11V11ZM3 13V3H5V13H3ZM19 13V3H21V13H19Z")
  )
}
