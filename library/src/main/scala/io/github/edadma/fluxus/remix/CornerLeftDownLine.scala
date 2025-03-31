/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerLeftDownLine icon from the Remix Icon library, Arrows category.
 */
case class CornerLeftDownLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerLeftDownLine icon component.
 *
 * @example CornerLeftDownLine <> CornerLeftDownLineProps(size = 24, color = "blue")
 */
def CornerLeftDownLine = (props: CornerLeftDownLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10.0002 5.00011L19.0001 4.99997L19.0001 6.99997L12.0002 7.00008L12.0001 17.1719L15.9498 13.2222L17.3641 14.6364L11.0001 21.0004L4.63614 14.6364L6.05035 13.2222L10.0001 17.172L10.0002 5.00011Z")
  )
}
