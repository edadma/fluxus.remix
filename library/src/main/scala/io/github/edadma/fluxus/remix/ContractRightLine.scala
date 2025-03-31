/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ContractRightLine icon from the Remix Icon library, Arrows category.
 */
case class ContractRightLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ContractRightLine icon component.
 *
 * @example ContractRightLine <> ContractRightLineProps(size = 24, color = "blue")
 */
def ContractRightLine = (props: ContractRightLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.1715 10.9999L7.51457 6.34305L8.92878 4.92883L15.9999 11.9999L8.92878 19.071L7.51457 17.6568L12.1714 12.9999L2.9996 13L2.99957 11L12.1715 10.9999ZM17.9996 18.9998L17.9996 4.99985H19.9996L19.9996 18.9998H17.9996Z")
  )
}
