/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * HomeSmile2Line icon from the Remix Icon library, Buildings category.
 */
case class HomeSmile2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * HomeSmile2Line icon component.
 *
 * @example HomeSmile2Line <> HomeSmile2LineProps(size = 24, color = "blue")
 */
def HomeSmile2Line = (props: HomeSmile2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19 19V9.79875L12 4.27675L5 9.79875V19H19ZM21 20C21 20.5523 20.5523 21 20 21H4C3.44772 21 3 20.5523 3 20V9.31391C3 9.00773 3.14027 8.71843 3.38065 8.52879L11.3807 2.21793C11.7438 1.93142 12.2562 1.93142 12.6193 2.21793L20.6193 8.52879C20.8597 8.71843 21 9.00773 21 9.31391V20ZM7 12H9C9 13.6569 10.3431 15 12 15C13.6569 15 15 13.6569 15 12H17C17 14.7614 14.7614 17 12 17C9.23858 17 7 14.7614 7 12Z")
  )
}
