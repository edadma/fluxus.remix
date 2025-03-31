/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Cake3Fill icon from the Remix Icon library, Food category.
 */
case class Cake3FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Cake3Fill icon component.
 *
 * @example Cake3Fill <> Cake3FillProps(size = 24, color = "blue")
 */
def Cake3Fill = (props: Cake3FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.5 2C17.433 2 19 3.567 19 5.5C19 5.72679 18.9784 5.94854 18.9372 6.16332L18.9223 6.22941C20.7106 6.82471 22 8.51178 22 10.5C22 12.3741 20.8544 13.9806 19.2253 14.6574L18.1393 21.1644C18.0589 21.6466 17.6417 22 17.1529 22H6.84713C6.35829 22 5.9411 21.6466 5.86073 21.1644L4.832 14.994C3.24892 14.9037 2 13.5977 2 12C2 10.6926 2.83627 9.5806 4.00306 9.16963L4 9C4 5.68629 6.68629 3 10 3C10.9216 3 11.7947 3.20779 12.575 3.57908C13.1988 2.62827 14.276 2 15.5 2ZM11 15H9V20H11V15ZM15 15H13V20H15V15ZM17.5 13C18.8807 13 20 11.8807 20 10.5C20 9.11929 18.8807 8 17.5 8C17.1643 8 16.8417 8.06519 16.5442 8.18959L16.3688 8.27129C15.4021 8.76932 14.2253 8.40165 13.7059 7.46716L13.6362 7.32984C12.9876 5.92108 11.5778 5 10 5C7.8578 5 6.10892 6.68397 6.0046 8.76748L5.99967 8.96394L6.00273 9.13357C6.0173 9.94127 5.54534 10.6726 4.8166 10.9967L4.6675 11.056C4.27121 11.1956 4 11.5722 4 12C4 12.5523 4.44772 13 5 13H17.5Z")
  )
}
