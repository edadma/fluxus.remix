/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FileDamageFill icon from the Remix Icon library, Document category.
 */
case class FileDamageFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FileDamageFill icon component.
 *
 * @example FileDamageFill <> FileDamageFillProps(size = 24, color = "blue")
 */
def FileDamageFill = (props: FileDamageFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 14L7 16.5L10 13L13 17L15 14.5L18 15L15 12L13 14.5L10 9.5L6.5 13.25L3 10V2.9918C3 2.45531 3.44694 2 3.99826 2H14V8C14 8.55228 14.4477 9 15 9H21V20.9925C21 21.5511 20.5552 22 20.0066 22H3.9934C3.44495 22 3 21.556 3 21.0082V14ZM21 7H16V2.00318L21 7Z")
  )
}
