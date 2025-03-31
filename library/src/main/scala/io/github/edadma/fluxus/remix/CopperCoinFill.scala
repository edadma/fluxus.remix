/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CopperCoinFill icon from the Remix Icon library, Finance category.
 */
case class CopperCoinFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CopperCoinFill icon component.
 *
 * @example CopperCoinFill <> CopperCoinFillProps(size = 24, color = "blue")
 */
def CopperCoinFill = (props: CopperCoinFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.0049 22.0027C6.48204 22.0027 2.00488 17.5256 2.00488 12.0027C2.00488 6.4799 6.48204 2.00275 12.0049 2.00275C17.5277 2.00275 22.0049 6.4799 22.0049 12.0027C22.0049 17.5256 17.5277 22.0027 12.0049 22.0027ZM12.0049 7.76011L7.76224 12.0027L12.0049 16.2454L16.2475 12.0027L12.0049 7.76011Z")
  )
}
