/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CouponFill icon from the Remix Icon library, Finance category.
 */
case class CouponFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CouponFill icon component.
 *
 * @example CouponFill <> CouponFillProps(size = 24, color = "blue")
 */
def CouponFill = (props: CouponFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2.00488 9.49966V3.99966C2.00488 3.44738 2.4526 2.99966 3.00488 2.99966H21.0049C21.5572 2.99966 22.0049 3.44738 22.0049 3.99966V9.49966C20.6242 9.49966 19.5049 10.619 19.5049 11.9997C19.5049 13.3804 20.6242 14.4997 22.0049 14.4997V19.9997C22.0049 20.5519 21.5572 20.9997 21.0049 20.9997H3.00488C2.4526 20.9997 2.00488 20.5519 2.00488 19.9997V14.4997C3.38559 14.4997 4.50488 13.3804 4.50488 11.9997C4.50488 10.619 3.38559 9.49966 2.00488 9.49966ZM9.00488 8.99966V10.9997H15.0049V8.99966H9.00488ZM9.00488 12.9997V14.9997H15.0049V12.9997H9.00488Z")
  )
}
