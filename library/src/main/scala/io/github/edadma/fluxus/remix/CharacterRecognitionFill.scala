/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CharacterRecognitionFill icon from the Remix Icon library, Others category.
 */
case class CharacterRecognitionFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CharacterRecognitionFill icon component.
 *
 * @example CharacterRecognitionFill <> CharacterRecognitionFillProps(size = 24, color = "blue")
 */
def CharacterRecognitionFill = (props: CharacterRecognitionFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20.998 3V21H2.99805V3H20.998ZM12.997 6H10.997L6.59805 17H8.75205L9.95105 14H14.041L15.242 17H17.397L12.997 6ZM11.997 8.88517L13.242 12H10.75L11.997 8.88517Z")
  )
}
