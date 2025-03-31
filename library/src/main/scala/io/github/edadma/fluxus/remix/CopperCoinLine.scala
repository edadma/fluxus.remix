/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CopperCoinLine icon from the Remix Icon library, Finance category.
 */
case class CopperCoinLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CopperCoinLine icon component.
 *
 * @example CopperCoinLine <> CopperCoinLineProps(size = 24, color = "blue")
 */
def CopperCoinLine = (props: CopperCoinLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.0049 22.0027C6.48204 22.0027 2.00488 17.5256 2.00488 12.0027C2.00488 6.4799 6.48204 2.00275 12.0049 2.00275C17.5277 2.00275 22.0049 6.4799 22.0049 12.0027C22.0049 17.5256 17.5277 22.0027 12.0049 22.0027ZM12.0049 20.0027C16.4232 20.0027 20.0049 16.421 20.0049 12.0027C20.0049 7.58447 16.4232 4.00275 12.0049 4.00275C7.5866 4.00275 4.00488 7.58447 4.00488 12.0027C4.00488 16.421 7.5866 20.0027 12.0049 20.0027ZM12.0049 7.053L16.9546 12.0027L12.0049 16.9525L7.05514 12.0027L12.0049 7.053ZM12.0049 9.88143L9.88356 12.0027L12.0049 14.1241L14.1262 12.0027L12.0049 9.88143Z")
  )
}
