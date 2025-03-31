/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Exchange2Fill icon from the Remix Icon library, Finance category.
 */
case class Exchange2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Exchange2Fill icon component.
 *
 * @example Exchange2Fill <> Exchange2FillProps(size = 24, color = "blue")
 */
def Exchange2Fill = (props: Exchange2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 21.5C4.51472 21.5 2.5 19.4853 2.5 17C2.5 14.5147 4.51472 12.5 7 12.5C9.48528 12.5 11.5 14.5147 11.5 17C11.5 19.4853 9.48528 21.5 7 21.5ZM17 11.5C14.5147 11.5 12.5 9.48528 12.5 7C12.5 4.51472 14.5147 2.5 17 2.5C19.4853 2.5 21.5 4.51472 21.5 7C21.5 9.48528 19.4853 11.5 17 11.5ZM3 8C3 5.23858 5.23858 3 8 3H11V5H8C6.34315 5 5 6.34315 5 8V11H3V8ZM19 13V16C19 17.6569 17.6569 19 16 19H13V21H16C18.7614 21 21 18.7614 21 16V13H19Z")
  )
}
