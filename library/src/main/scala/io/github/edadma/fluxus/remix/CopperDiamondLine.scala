/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CopperDiamondLine icon from the Remix Icon library, Finance category.
 */
case class CopperDiamondLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CopperDiamondLine icon component.
 *
 * @example CopperDiamondLine <> CopperDiamondLineProps(size = 24, color = "blue")
 */
def CopperDiamondLine = (props: CopperDiamondLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.0049 22.0027C6.48204 22.0027 2.00488 17.5256 2.00488 12.0027C2.00488 6.4799 6.48204 2.00275 12.0049 2.00275C17.5277 2.00275 22.0049 6.4799 22.0049 12.0027C22.0049 17.5256 17.5277 22.0027 12.0049 22.0027ZM12.0049 20.0027C16.4232 20.0027 20.0049 16.421 20.0049 12.0027C20.0049 7.58447 16.4232 4.00275 12.0049 4.00275C7.5866 4.00275 4.00488 7.58447 4.00488 12.0027C4.00488 16.421 7.5866 20.0027 12.0049 20.0027ZM9.00488 8.00275H15.0049L17.5049 11.5027L12.0041 17.0027L6.50488 11.5027L9.00488 8.00275ZM10.0349 10.0027L9.11488 11.2927L12.0041 14.1827L14.8949 11.2927L13.9749 10.0027H10.0349Z")
  )
}
