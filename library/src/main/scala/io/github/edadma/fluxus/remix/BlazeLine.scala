/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BlazeLine icon from the Remix Icon library, Weather category.
 */
case class BlazeLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BlazeLine icon component.
 *
 * @example BlazeLine <> BlazeLineProps(size = 24, color = "blue")
 */
def BlazeLine = (props: BlazeLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19 9C19.6667 10.0606 20 11.3939 20 13C20 16 16.5 17 15 22C14.3333 21.4254 14 20.5921 14 19.5C14 16.0181 19 14.2101 19 9ZM14.5 5C15.1667 6.23841 15.5 7.57175 15.5 9C15.5 14 9.5 15 11.5 22C9.83333 20.8392 9 19.1726 9 17C9 13.675 14.5 11 14.5 5ZM10 1C10.6667 2.33333 11 3.83333 11 5.5C11 11.5 2 13 8 22C5.5 21.5 3.5 19 3.5 16C3.5 9.5 10 8.5 10 1Z")
  )
}
