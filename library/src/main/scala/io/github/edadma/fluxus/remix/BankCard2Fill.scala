/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BankCard2Fill icon from the Remix Icon library, Finance category.
 */
case class BankCard2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BankCard2Fill icon component.
 *
 * @example BankCard2Fill <> BankCard2FillProps(size = 24, color = "blue")
 */
def BankCard2Fill = (props: BankCard2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22.0049 10.9998V19.9998C22.0049 20.5521 21.5572 20.9998 21.0049 20.9998H3.00488C2.4526 20.9998 2.00488 20.5521 2.00488 19.9998V10.9998H22.0049ZM22.0049 6.99979H2.00488V3.99979C2.00488 3.4475 2.4526 2.99979 3.00488 2.99979H21.0049C21.5572 2.99979 22.0049 3.4475 22.0049 3.99979V6.99979Z")
  )
}
