/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Coupon4Line icon from the Remix Icon library, Finance category.
 */
case class Coupon4LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Coupon4Line icon component.
 *
 * @example Coupon4Line <> Coupon4LineProps(size = 24, color = "blue")
 */
def Coupon4Line = (props: Coupon4LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10.0049 20.9998H3.00488C2.4526 20.9998 2.00488 20.5521 2.00488 19.9998V3.99979C2.00488 3.4475 2.4526 2.99979 3.00488 2.99979H10.0049C10.0049 4.10436 10.9003 4.99979 12.0049 4.99979C13.1095 4.99979 14.0049 4.10436 14.0049 2.99979H21.0049C21.5572 2.99979 22.0049 3.4475 22.0049 3.99979V19.9998C22.0049 20.5521 21.5572 20.9998 21.0049 20.9998H14.0049C14.0049 19.8952 13.1095 18.9998 12.0049 18.9998C10.9003 18.9998 10.0049 19.8952 10.0049 20.9998ZM8.54001 18.9998C9.23163 17.8042 10.5243 16.9998 12.0049 16.9998C13.4854 16.9998 14.7781 17.8042 15.4698 18.9998H20.0049V4.99979H15.4698C14.7781 6.19539 13.4854 6.99979 12.0049 6.99979C10.5243 6.99979 9.23163 6.19539 8.54001 4.99979H4.00488V18.9998H8.54001ZM6.00488 7.99979H8.00488V15.9998H6.00488V7.99979ZM16.0049 7.99979H18.0049V15.9998H16.0049V7.99979Z")
  )
}
