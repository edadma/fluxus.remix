/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * VoiceRecognitionFill icon from the Remix Icon library, Others category.
 */
case class VoiceRecognitionFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * VoiceRecognitionFill icon component.
 *
 * @example VoiceRecognitionFill <> VoiceRecognitionFillProps(size = 24, color = "blue")
 */
def VoiceRecognitionFill = (props: VoiceRecognitionFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20.998 3V21H2.99805V3H20.998ZM12.998 6H10.998V18H12.998V6ZM8.99805 9H6.99805V15H8.99805V9ZM16.998 9H14.998V15H16.998V9Z")
  )
}
