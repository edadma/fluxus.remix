/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * RainyFill icon from the Remix Icon library, Weather category.
 */
case class RainyFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * RainyFill icon component.
 *
 * @example RainyFill <> RainyFillProps(size = 24, color = "blue")
 */
def RainyFill = (props: RainyFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.86 18L12.7071 14.8471C12.3166 14.4566 11.6834 14.4566 11.2929 14.8471L8.18137 17.9586C4.14765 17.5486 1 14.1419 1 10C1 5.58172 4.58172 2 9 2C11.9967 2 14.6086 3.64768 15.9791 6.08651C16.3109 6.02963 16.652 6 17 6C20.3137 6 23 8.68629 23 12C23 15.3137 20.3137 18 17 18H15.86ZM10.2322 18.7322L12 16.9645L13.7678 18.7322C14.7441 19.7085 14.7441 21.2915 13.7678 22.2678C12.7915 23.2441 11.2085 23.2441 10.2322 22.2678C9.25592 21.2915 9.25592 19.7085 10.2322 18.7322Z")
  )
}
