/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * VuejsFill icon from the Remix Icon library, Logos category.
 */
case class VuejsFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * VuejsFill icon component.
 *
 * @example VuejsFill <> VuejsFillProps(size = 24, color = "blue")
 */
def VuejsFill = (props: VuejsFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M1.00098 3H5.00098L12.001 15L19.001 3H23.001L12.001 22L1.00098 3ZM9.66764 3L12.001 7L14.3343 3H18.3694L12.001 14L5.63256 3H9.66764Z")
  )
}
