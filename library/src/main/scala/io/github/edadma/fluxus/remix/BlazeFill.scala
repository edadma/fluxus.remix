/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BlazeFill icon from the Remix Icon library, Weather category.
 */
case class BlazeFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BlazeFill icon component.
 *
 * @example BlazeFill <> BlazeFillProps(size = 24, color = "blue")
 */
def BlazeFill = (props: BlazeFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18.5 9C19.5 10.0606 20 11.3939 20 13C20 16.4664 16.3 17.276 14.5 22C13.8333 21.4254 13.5 20.5921 13.5 19.5C13.5 16.0181 18.5 14.2101 18.5 9ZM14.5 5C15.7 6.23841 16.3 7.57175 16.3 9C16.3 13.9513 10.2552 14.6918 11.5 22C9.83333 20.8392 9 19.1726 9 17C9 13.675 14.5 11 14.5 5ZM10 1C11.3333 2.66667 12 4.16667 12 5.5C12 11.75 3.5 13.7218 8 22C5.38352 21.4203 3.5 19 3.5 16C3.5 9.5 10 8.5 10 1Z")
  )
}
