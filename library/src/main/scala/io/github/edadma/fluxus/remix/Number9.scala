/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Number9 icon from the Remix Icon library, Editor category.
 */
case class Number9Props(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Number9 icon component.
 *
 * @example Number9 <> Number9Props(size = 24, color = "blue")
 */
def Number9 = (props: Number9Props) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 1.5C15.5899 1.5 18.5 4.41015 18.5 8C18.5 9.19219 18.179 10.3094 17.6188 11.27L11.423 21.999H9.114L13.5528 14.3134C13.0553 14.4353 12.5352 14.5 12 14.5C8.41015 14.5 5.5 11.5899 5.5 8C5.5 4.41015 8.41015 1.5 12 1.5ZM12 3.5C9.51472 3.5 7.5 5.51472 7.5 8C7.5 10.4853 9.51472 12.5 12 12.5C14.4853 12.5 16.5 10.4853 16.5 8C16.5 5.51472 14.4853 3.5 12 3.5Z")
  )
}
