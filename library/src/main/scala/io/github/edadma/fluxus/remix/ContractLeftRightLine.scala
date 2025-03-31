/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ContractLeftRightLine icon from the Remix Icon library, Arrows category.
 */
case class ContractLeftRightLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ContractLeftRightLine icon component.
 *
 * @example ContractLeftRightLine <> ContractLeftRightLineProps(size = 24, color = "blue")
 */
def ContractLeftRightLine = (props: ContractLeftRightLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18.793 5.79285 12.5859 12 18.793 18.2071 20.2072 16.7928 15.4143 12 20.2072 7.20706 18.793 5.79285ZM5.20694 18.2072 11.414 12.0001 5.20694 5.793 3.79272 7.20721 8.58562 12.0001 3.79272 16.793 5.20694 18.2072Z")
  )
}
