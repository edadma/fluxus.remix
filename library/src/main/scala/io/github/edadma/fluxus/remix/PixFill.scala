/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PixFill icon from the Remix Icon library, Logos category.
 */
case class PixFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PixFill icon component.
 *
 * @example PixFill <> PixFillProps(size = 24, color = "blue")
 */
def PixFill = (props: PixFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14.4754 1.7678C13.1086 0.400967 10.8925 0.400967 9.52565 1.7678L5.39898 5.89447C6.50441 5.82558 7.63299 6.2135 8.47774 7.05825L11.4703 10.0508C11.7632 10.3437 12.2381 10.3437 12.531 10.0508L15.5235 7.05833C16.3682 6.2136 17.4967 5.82567 18.6021 5.89454L14.4754 1.7678ZM20.4538 7.74617L22.2328 9.52516C23.5943 10.8867 23.5996 13.091 22.2485 14.4591L20.4741 16.2335C19.3025 17.4051 17.403 17.4051 16.2314 16.2335L13.2381 13.2402C12.5547 12.5567 11.4466 12.5567 10.7632 13.2402L7.76977 16.2336C6.5982 17.4052 4.69871 17.4052 3.52713 16.2336L1.74761 14.4541C0.40149 13.0856 0.408385 10.8851 1.76829 9.52516L3.54282 7.75063C4.71554 6.59381 6.60399 6.59872 7.77063 7.76536L10.7632 10.7579C11.4466 11.4413 12.5547 11.4413 13.2381 10.7579L16.2306 7.76543C17.3957 6.60032 19.2807 6.5939 20.4538 7.74617ZM5.39783 18.1045C6.50336 18.1734 7.63206 17.7855 8.47688 16.9407L11.4703 13.9473C11.7632 13.6544 12.2381 13.6544 12.531 13.9473L15.5243 16.9406C16.3691 17.7854 17.4978 18.1733 18.6033 18.1044L14.4754 22.2323C13.1086 23.5991 10.8925 23.5991 9.52565 22.2323L5.39783 18.1045Z")
  )
}
