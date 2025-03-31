/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * RidingLine icon from the Remix Icon library, Map category.
 */
case class RidingLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * RidingLine icon component.
 *
 * @example RidingLine <> RidingLineProps(size = 24, color = "blue")
 */
def RidingLine = (props: RidingLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5.5 21C3.01472 21 1 18.9853 1 16.5C1 14.0147 3.01472 12 5.5 12C7.98528 12 10 14.0147 10 16.5C10 18.9853 7.98528 21 5.5 21ZM5.5 19C6.88071 19 8 17.8807 8 16.5C8 15.1193 6.88071 14 5.5 14C4.11929 14 3 15.1193 3 16.5C3 17.8807 4.11929 19 5.5 19ZM18.5 21C16.0147 21 14 18.9853 14 16.5C14 14.0147 16.0147 12 18.5 12C20.9853 12 23 14.0147 23 16.5C23 18.9853 20.9853 21 18.5 21ZM18.5 19C19.8807 19 21 17.8807 21 16.5C21 15.1193 19.8807 14 18.5 14C17.1193 14 16 15.1193 16 16.5C16 17.8807 17.1193 19 18.5 19ZM11.023 10.3054L13 12V18H11V13L8.28117 10.7343C8.18221 10.6661 8.08802 10.588 8 10.5C7.21895 9.71895 7.21895 8.45262 8 7.67157L10.8284 4.84315C11.6095 4.0621 12.8758 4.0621 13.6569 4.84315L15.0711 6.25736C16.1746 7.36086 17.5548 8.01891 18.9884 8.23151L18.978 10.2474C17.0335 10.0218 15.1485 9.16323 13.6569 7.67157L11.023 10.3054ZM16 5C14.8954 5 14 4.10457 14 3C14 1.89543 14.8954 1 16 1C17.1046 1 18 1.89543 18 3C18 4.10457 17.1046 5 16 5Z")
  )
}
