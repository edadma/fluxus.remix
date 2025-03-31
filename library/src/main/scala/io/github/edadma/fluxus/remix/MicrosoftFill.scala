/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MicrosoftFill icon from the Remix Icon library, Logos category.
 */
case class MicrosoftFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MicrosoftFill icon component.
 *
 * @example MicrosoftFill <> MicrosoftFillProps(size = 24, color = "blue")
 */
def MicrosoftFill = (props: MicrosoftFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11.501 3V11.5H3.00098V3H11.501ZM11.501 21H3.00098V12.5H11.501V21ZM12.501 3H21.001V11.5H12.501V3ZM21.001 12.5V21H12.501V12.5H21.001Z")
  )
}
