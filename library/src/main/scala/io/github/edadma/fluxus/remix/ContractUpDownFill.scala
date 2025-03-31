/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ContractUpDownFill icon from the Remix Icon library, Arrows category.
 */
case class ContractUpDownFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ContractUpDownFill icon component.
 *
 * @example ContractUpDownFill <> ContractUpDownFillProps(size = 24, color = "blue")
 */
def ContractUpDownFill = (props: ContractUpDownFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18 5 12 11 6 5H18ZM18 19 12 13 6 19H18Z")
  )
}
