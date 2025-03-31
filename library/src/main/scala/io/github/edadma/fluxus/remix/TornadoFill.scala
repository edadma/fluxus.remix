/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TornadoFill icon from the Remix Icon library, Weather category.
 */
case class TornadoFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TornadoFill icon component.
 *
 * @example TornadoFill <> TornadoFillProps(size = 24, color = "blue")
 */
def TornadoFill = (props: TornadoFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 3H22V5H2V3ZM4 7H20V9H4V7ZM8 11H22V13H8V11ZM10 15H18V17H10V15ZM8 19H14V21H8V19Z")
  )
}
