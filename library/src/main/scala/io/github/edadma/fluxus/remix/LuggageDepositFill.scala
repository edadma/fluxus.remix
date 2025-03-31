/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * LuggageDepositFill icon from the Remix Icon library, Map category.
 */
case class LuggageDepositFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * LuggageDepositFill icon component.
 *
 * @example LuggageDepositFill <> LuggageDepositFillProps(size = 24, color = "blue")
 */
def LuggageDepositFill = (props: LuggageDepositFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15 3C15.5523 3 16 3.44772 16 4V6H20C20.5523 6 21 6.44772 21 7V19H23V21H1V19H3V7C3 6.44772 3.44772 6 4 6H8V4C8 3.44772 8.44772 3 9 3H15ZM10 8H8V19H10V8ZM16 8H14V19H16V8ZM14 5H10V6H14V5Z")
  )
}
