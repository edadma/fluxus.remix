/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MicrosoftLoopLine icon from the Remix Icon library, Logos category.
 */
case class MicrosoftLoopLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MicrosoftLoopLine icon component.
 *
 * @example MicrosoftLoopLine <> MicrosoftLoopLineProps(size = 24, color = "blue")
 */
def MicrosoftLoopLine = (props: MicrosoftLoopLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 4C16.4183 4 20 7.58172 20 12C20 16.4183 16.4183 20 12 20H7.69043C8.59297 19.0595 9.21538 17.8481 9.42355 16.5H12C14.4853 16.5 16.5 14.4853 16.5 12C16.5 9.51472 14.4853 7.5 12 7.5C9.51472 7.5 7.5 9.51472 7.5 12V15.5C7.5 17.6416 6.00399 19.4338 4 19.8885V12C4 7.58172 7.58172 4 12 4ZM12 22C17.5228 22 22 17.5228 22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12V22H12ZM9.5 14.5V12C9.5 10.6193 10.6193 9.5 12 9.5C13.3807 9.5 14.5 10.6193 14.5 12C14.5 13.3807 13.3807 14.5 12 14.5H9.5Z")
  )
}
