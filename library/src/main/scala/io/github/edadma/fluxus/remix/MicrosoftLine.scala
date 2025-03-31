/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MicrosoftLine icon from the Remix Icon library, Logos category.
 */
case class MicrosoftLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MicrosoftLine icon component.
 *
 * @example MicrosoftLine <> MicrosoftLineProps(size = 24, color = "blue")
 */
def MicrosoftLine = (props: MicrosoftLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11.001 5H5.00098V11H11.001V5ZM13.001 5V11H19.001V5H13.001ZM19.001 13H13.001V19H19.001V13ZM11.001 19V13H5.00098V19H11.001ZM3.00098 3H21.001V21H3.00098V3Z")
  )
}
