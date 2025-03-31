/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FundsBoxLine icon from the Remix Icon library, Finance category.
 */
case class FundsBoxLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FundsBoxLine icon component.
 *
 * @example FundsBoxLine <> FundsBoxLineProps(size = 24, color = "blue")
 */
def FundsBoxLine = (props: FundsBoxLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.00488 5.00281V19.0028H20.0049V5.00281H4.00488ZM3.00488 3.00281H21.0049C21.5572 3.00281 22.0049 3.45052 22.0049 4.00281V20.0028C22.0049 20.5551 21.5572 21.0028 21.0049 21.0028H3.00488C2.4526 21.0028 2.00488 20.5551 2.00488 20.0028V4.00281C2.00488 3.45052 2.4526 3.00281 3.00488 3.00281ZM14.7978 9.7957L13.0049 8.00281H18.0049V13.0028L16.212 11.2099L12.348 15.0739L10.2267 12.9526L7.39828 15.781L5.98407 14.3668L10.2267 10.1241L12.348 12.2454L14.7978 9.7957Z")
  )
}
