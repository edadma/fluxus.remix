/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * AnthropicLine icon from the Remix Icon library, Logos category.
 */
case class AnthropicLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * AnthropicLine icon component.
 *
 * @example AnthropicLine <> AnthropicLineProps(size = 24, color = "blue")
 */
def AnthropicLine = (props: AnthropicLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14.1219 5H16.2678L22.1012 20H19.9553L14.1219 5ZM7.65986 5H10.3411L16.1103 20H13.9675L12.429 16H5.57192L4.03345 20H1.89062L7.65986 5ZM11.6598 14L9.00047 7.08577L6.34115 14H11.6598Z")
  )
}
