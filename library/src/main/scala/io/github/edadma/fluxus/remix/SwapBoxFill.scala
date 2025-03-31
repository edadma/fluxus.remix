/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SwapBoxFill icon from the Remix Icon library, Finance category.
 */
case class SwapBoxFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SwapBoxFill icon component.
 *
 * @example SwapBoxFill <> SwapBoxFillProps(size = 24, color = "blue")
 */
def SwapBoxFill = (props: SwapBoxFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3.00488 3.00275H21.0049C21.5572 3.00275 22.0049 3.45046 22.0049 4.00275V20.0027C22.0049 20.555 21.5572 21.0027 21.0049 21.0027H3.00488C2.4526 21.0027 2.00488 20.555 2.00488 20.0027V4.00275C2.00488 3.45046 2.4526 3.00275 3.00488 3.00275ZM15.0049 7.00275V9.00275H11.0049V11.0027H15.0049V13.0027L18.5049 10.0027L15.0049 7.00275ZM9.00488 17.0027V15.0027H13.0049V13.0027H9.00488V11.0027L5.50488 14.0027L9.00488 17.0027Z")
  )
}
