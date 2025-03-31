/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ContractLeftRightFill icon from the Remix Icon library, Arrows category.
 */
case class ContractLeftRightFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ContractLeftRightFill icon component.
 *
 * @example ContractLeftRightFill <> ContractLeftRightFillProps(size = 24, color = "blue")
 */
def ContractLeftRightFill = (props: ContractLeftRightFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5 18 11 12 5 6V18ZM19 6 13 12 19 18V6Z")
  )
}
