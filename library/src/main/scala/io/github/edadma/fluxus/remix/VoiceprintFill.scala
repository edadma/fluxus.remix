/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * VoiceprintFill icon from the Remix Icon library, Media category.
 */
case class VoiceprintFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * VoiceprintFill icon component.
 *
 * @example VoiceprintFill <> VoiceprintFillProps(size = 24, color = "blue")
 */
def VoiceprintFill = (props: VoiceprintFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5 7H7V17H5V7ZM1 10H3V14H1V10ZM9 2H11V20H9V2ZM13 4H15V22H13V4ZM17 7H19V17H17V7ZM21 10H23V14H21V10Z")
  )
}
