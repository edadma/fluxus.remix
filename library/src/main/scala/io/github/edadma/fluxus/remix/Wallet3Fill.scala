/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Wallet3Fill icon from the Remix Icon library, Finance category.
 */
case class Wallet3FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Wallet3Fill icon component.
 *
 * @example Wallet3Fill <> Wallet3FillProps(size = 24, color = "blue")
 */
def Wallet3Fill = (props: Wallet3FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22.0049 5.99979H15.0049C11.6912 5.99979 9.00488 8.68608 9.00488 11.9998C9.00488 15.3135 11.6912 17.9998 15.0049 17.9998H22.0049V19.9998C22.0049 20.5521 21.5572 20.9998 21.0049 20.9998H3.00488C2.4526 20.9998 2.00488 20.5521 2.00488 19.9998V3.99979C2.00488 3.4475 2.4526 2.99979 3.00488 2.99979H21.0049C21.5572 2.99979 22.0049 3.4475 22.0049 3.99979V5.99979ZM15.0049 7.99979H23.0049V15.9998H15.0049C12.7957 15.9998 11.0049 14.2089 11.0049 11.9998C11.0049 9.79065 12.7957 7.99979 15.0049 7.99979ZM15.0049 10.9998V12.9998H18.0049V10.9998H15.0049Z")
  )
}
