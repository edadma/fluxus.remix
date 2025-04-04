/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * LockStarFill icon from the Remix Icon library, System category.
 */
case class LockStarFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * LockStarFill icon component.
 *
 * @example LockStarFill <> LockStarFillProps(size = 24, color = "blue")
 */
def LockStarFill = (props: LockStarFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 1C8.68629 1 6 3.68629 6 7V8H4C3.44772 8 3 8.44772 3 9V21C3 21.5523 3.44772 22 4 22H13.044C12.6947 21.2389 12.5 20.3922 12.5 19.5C12.5 16.1863 15.1863 13.5 18.5 13.5C19.3922 13.5 20.2389 13.6947 21 14.044V9C21 8.44772 20.5523 8 20 8H18V7C18 3.68629 15.3137 1 12 1ZM16 8H8V7C8 4.79086 9.79086 3 12 3C14.2091 3 16 4.79086 16 7V8ZM21.145 23.1406L20.6399 20.1953L22.7798 18.1094L19.8225 17.6797L18.5 15L17.1775 17.6797L14.2202 18.1094L16.3601 20.1953L15.855 23.1406L18.5 21.75L21.145 23.1406Z")
  )
}
