/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TerminalLine icon from the Remix Icon library, Development category.
 */
case class TerminalLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TerminalLine icon component.
 *
 * @example TerminalLine <> TerminalLineProps(size = 24, color = "blue")
 */
def TerminalLine = (props: TerminalLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10.9999 12L3.92886 19.0711L2.51465 17.6569L8.1715 12L2.51465 6.34317L3.92886 4.92896L10.9999 12ZM10.9999 19H20.9999V21H10.9999V19Z")
  )
}
