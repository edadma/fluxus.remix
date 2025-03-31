/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ParenthesesFill icon from the Remix Icon library, Development category.
 */
case class ParenthesesFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ParenthesesFill icon component.
 *
 * @example ParenthesesFill <> ParenthesesFillProps(size = 24, color = "blue")
 */
def ParenthesesFill = (props: ParenthesesFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6.92316 21C5.11268 18.6642 4 15.493 4 12C4 8.50702 5.11268 5.33579 6.92316 3H8.93729C7.23506 5.3884 6.2 8.54241 6.2 12C6.2 15.4576 7.23506 18.6116 8.93729 21H6.92316ZM17.0741 21H15.06C16.7622 18.6116 17.7973 15.4576 17.7973 12C17.7973 8.54241 16.7622 5.3884 15.06 3H17.0741C18.8846 5.33579 19.9973 8.50702 19.9973 12C19.9973 15.493 18.8846 18.6642 17.0741 21Z")
  )
}
