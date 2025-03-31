/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandLeftFill icon from the Remix Icon library, Arrows category.
 */
case class ExpandLeftFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandLeftFill icon component.
 *
 * @example ExpandLeftFill <> ExpandLeftFillProps(size = 24, color = "blue")
 */
def ExpandLeftFill = (props: ExpandLeftFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9.99994 4.99988V10.9999L16.0002 11.0002L16.0002 13.0002L9.99994 12.9999V18.9999L2.99994 12.0001L9.99994 4.99988ZM18.0001 19.0001V5.00006H20.0001V19.0001H18.0001Z")
  )
}
