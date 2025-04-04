/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SwapFill icon from the Remix Icon library, Finance category.
 */
case class SwapFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SwapFill icon component.
 *
 * @example SwapFill <> SwapFillProps(size = 24, color = "blue")
 */
def SwapFill = (props: SwapFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.0049 22.0027C6.48204 22.0027 2.00488 17.5256 2.00488 12.0027C2.00488 6.4799 6.48204 2.00275 12.0049 2.00275C17.5277 2.00275 22.0049 6.4799 22.0049 12.0027C22.0049 17.5256 17.5277 22.0027 12.0049 22.0027ZM7.00488 9.00275H9.00488V13.0027H11.0049V9.00275H13.0049L10.0049 5.50275L7.00488 9.00275ZM17.0049 15.0027H15.0049V11.0027H13.0049V15.0027H11.0049L14.0049 18.5027L17.0049 15.0027Z")
  )
}
