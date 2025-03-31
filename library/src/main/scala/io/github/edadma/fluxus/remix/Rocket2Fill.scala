/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Rocket2Fill icon from the Remix Icon library, Map category.
 */
case class Rocket2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Rocket2Fill icon component.
 *
 * @example Rocket2Fill <> Rocket2FillProps(size = 24, color = "blue")
 */
def Rocket2Fill = (props: Rocket2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8.49816 20.0048H15.5018C14.8432 21.5842 13.5794 22.848 12 23.5066C10.4206 22.848 9.15679 21.5842 8.49816 20.0048ZM18 14.8095L20 17.0778V19.0048H4V17.0778L6 14.8095V9.00481C6 5.52156 8.50442 2.55825 12 1.46002C15.4956 2.55825 18 5.52156 18 9.00481V14.8095ZM12 11.0048C13.1046 11.0048 14 10.1094 14 9.00481C14 7.90024 13.1046 7.00481 12 7.00481C10.8954 7.00481 10 7.90024 10 9.00481C10 10.1094 10.8954 11.0048 12 11.0048Z")
  )
}
