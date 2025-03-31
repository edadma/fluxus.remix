/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * InkBottleFill icon from the Remix Icon library, Design category.
 */
case class InkBottleFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * InkBottleFill icon component.
 *
 * @example InkBottleFill <> InkBottleFillProps(size = 24, color = "blue")
 */
def InkBottleFill = (props: InkBottleFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 8.99669L20.3714 10.7452C20.751 10.8971 21 11.2648 21 11.6737V20.9967C21 21.549 20.5523 21.9967 20 21.9967H4C3.44772 21.9967 3 21.549 3 20.9967V11.6737C3 11.2648 3.24895 10.8971 3.62861 10.7452L8 8.99669H16ZM20 13.9967H8V18.9967H20V13.9967ZM16 2.99669C16.5523 2.99669 17 3.4444 17 3.99669V7.99669H7V3.99669C7 3.4444 7.44772 2.99669 8 2.99669H16Z")
  )
}
