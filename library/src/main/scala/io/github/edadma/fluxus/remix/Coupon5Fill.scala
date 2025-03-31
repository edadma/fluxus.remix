/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Coupon5Fill icon from the Remix Icon library, Finance category.
 */
case class Coupon5FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Coupon5Fill icon component.
 *
 * @example Coupon5Fill <> Coupon5FillProps(size = 24, color = "blue")
 */
def Coupon5Fill = (props: Coupon5FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21.0049 13.9997V20.9997C21.0049 21.552 20.5572 21.9997 20.0049 21.9997H4.00488C3.4526 21.9997 3.00488 21.552 3.00488 20.9997V13.9997C4.10945 13.9997 5.00488 13.1043 5.00488 11.9997C5.00488 10.8951 4.10945 9.99969 3.00488 9.99969V2.99969C3.00488 2.44741 3.4526 1.99969 4.00488 1.99969H20.0049C20.5572 1.99969 21.0049 2.44741 21.0049 2.99969V9.99969C19.9003 9.99969 19.0049 10.8951 19.0049 11.9997C19.0049 13.1043 19.9003 13.9997 21.0049 13.9997ZM9.00488 5.99969V7.99969H15.0049V5.99969H9.00488ZM9.00488 15.9997V17.9997H15.0049V15.9997H9.00488Z")
  )
}
