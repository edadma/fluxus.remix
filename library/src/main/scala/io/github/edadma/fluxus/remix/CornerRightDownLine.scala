/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CornerRightDownLine icon from the Remix Icon library, Arrows category.
 */
case class CornerRightDownLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CornerRightDownLine icon component.
 *
 * @example CornerRightDownLine <> CornerRightDownLineProps(size = 24, color = "blue")
 */
def CornerRightDownLine = (props: CornerRightDownLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.9998 5.00011L4.99991 4.99997L4.99988 6.99997L11.9998 7.00008L11.9999 17.1719L8.05015 13.2222L6.63594 14.6364L12.9999 21.0004L19.3639 14.6364L17.9496 13.2222L13.9999 17.172L13.9998 5.00011Z")
  )
}
