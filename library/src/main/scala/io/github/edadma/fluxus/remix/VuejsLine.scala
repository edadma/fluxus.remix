/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * VuejsLine icon from the Remix Icon library, Logos category.
 */
case class VuejsLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * VuejsLine icon component.
 *
 * @example VuejsLine <> VuejsLineProps(size = 24, color = "blue")
 */
def VuejsLine = (props: VuejsLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3.31677 3L12.001 18L20.6852 3H23.001L12.001 22L1.00098 3H3.31677ZM7.65887 3L12.001 10.5L16.3431 3H18.6589L12.001 14.5L5.34308 3H7.65887Z")
  )
}
