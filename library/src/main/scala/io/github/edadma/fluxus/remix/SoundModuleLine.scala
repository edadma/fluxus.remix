/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SoundModuleLine icon from the Remix Icon library, Media category.
 */
case class SoundModuleLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SoundModuleLine icon component.
 *
 * @example SoundModuleLine <> SoundModuleLineProps(size = 24, color = "blue")
 */
def SoundModuleLine = (props: SoundModuleLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 18V21H19V18H17V16H23V18H21ZM5 18V21H3V18H1V16H7V18H5ZM11 6V3H13V6H15V8H9V6H11ZM11 10H13V21H11V10ZM3 14V3H5V14H3ZM19 14V3H21V14H19Z")
  )
}
