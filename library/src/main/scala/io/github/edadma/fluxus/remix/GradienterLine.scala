/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * GradienterLine icon from the Remix Icon library, Device category.
 */
case class GradienterLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * GradienterLine icon component.
 *
 * @example GradienterLine <> GradienterLineProps(size = 24, color = "blue")
 */
def GradienterLine = (props: GradienterLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2.04932 13H4.06184C4.55393 16.9463 7.92032 20 11.9999 20C16.0796 20 19.4459 16.9463 19.938 13H21.9506C21.4488 18.0533 17.1853 22 11.9999 22C6.81459 22 2.55104 18.0533 2.04932 13ZM2.04932 11C2.55104 5.94668 6.81459 2 11.9999 2C17.1853 2 21.4488 5.94668 21.9506 11H19.938C19.4459 7.05369 16.0796 4 11.9999 4C7.92032 4 4.55393 7.05369 4.06184 11H2.04932ZM11.9999 14C10.8954 14 9.99994 13.1046 9.99994 12C9.99994 10.8954 10.8954 10 11.9999 10C13.1045 10 13.9999 10.8954 13.9999 12C13.9999 13.1046 13.1045 14 11.9999 14Z")
  )
}
