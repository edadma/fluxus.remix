/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Scales2Fill icon from the Remix Icon library, Others category.
 */
case class Scales2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Scales2Fill icon component.
 *
 * @example Scales2Fill <> Scales2FillProps(size = 24, color = "blue")
 */
def Scales2Fill = (props: Scales2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5.99805 2C5.99805 2.51284 6.48805 3 6.99805 3H16.998C17.5109 3 17.998 2.51 17.998 2H19.998C19.998 3.65685 18.6549 5 16.998 5H12.998L12.999 7.06201C16.9449 7.55453 19.998 10.9207 19.998 15V21C19.998 21.5523 19.5503 22 18.998 22H4.99805C4.44576 22 3.99805 21.5523 3.99805 21V15C3.99805 10.9204 7.05176 7.55396 10.9981 7.06189L10.998 5H6.99805C5.33805 5 3.99805 3.66 3.99805 2H5.99805ZM11.998 11C9.78891 11 7.99805 12.7909 7.99805 15C7.99805 17.2091 9.78891 19 11.998 19C14.2072 19 15.998 17.2091 15.998 15C15.998 14.2582 15.7961 13.5635 15.4442 12.968L12.7052 15.7071L12.6109 15.7903C12.2187 16.0953 11.6514 16.0676 11.2909 15.7071C10.9004 15.3166 10.9004 14.6834 11.2909 14.2929L14.03 11.5538C13.4345 11.2019 12.7399 11 11.998 11Z")
  )
}
