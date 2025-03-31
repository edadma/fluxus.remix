/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ContractRightFill icon from the Remix Icon library, Arrows category.
 */
case class ContractRightFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ContractRightFill icon component.
 *
 * @example ContractRightFill <> ContractRightFillProps(size = 24, color = "blue")
 */
def ContractRightFill = (props: ContractRightFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8.99988 4.99976L16.0002 12L8.99988 18.9998V12.9998L2.9999 13.0001L2.99988 11.0001L8.99988 10.9998V4.99976ZM17.9999 18.9999L18 4.99993H20L19.9999 18.9999H17.9999Z")
  )
}
