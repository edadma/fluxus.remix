/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ShoppingBag2Line icon from the Remix Icon library, Finance category.
 */
case class ShoppingBag2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ShoppingBag2Line icon component.
 *
 * @example ShoppingBag2Line <> ShoppingBag2LineProps(size = 24, color = "blue")
 */
def ShoppingBag2Line = (props: ShoppingBag2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20.0049 22H4.00488C3.4526 22 3.00488 21.5523 3.00488 21V3C3.00488 2.44772 3.4526 2 4.00488 2H20.0049C20.5572 2 21.0049 2.44772 21.0049 3V21C21.0049 21.5523 20.5572 22 20.0049 22ZM19.0049 20V4H5.00488V20H19.0049ZM9.00488 6V8C9.00488 9.65685 10.348 11 12.0049 11C13.6617 11 15.0049 9.65685 15.0049 8V6H17.0049V8C17.0049 10.7614 14.7663 13 12.0049 13C9.24346 13 7.00488 10.7614 7.00488 8V6H9.00488Z")
  )
}
